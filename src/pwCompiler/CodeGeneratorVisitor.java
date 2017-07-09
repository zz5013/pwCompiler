package pwCompiler;


import javax.swing.*;

import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;


import java.util.*;
/**
 * Created by zz5013 on 11/06/17.
 */
public class CodeGeneratorVisitor extends pWhileBaseVisitor<Value> {


    private ArrayList<String> varList;
    private Map<String, ArrayList<Object>> varScope;
    //private Map<String, ArrayList<Double>> varState; //useless map, only used for testing
    //private ArrayList<String> sessCode;
    private PrintWriter pw;
    private int TOCounter;
    private int UOCounter;
    private int currentScope;
    private ArrayList<ArrayList<String>> scopeCode;
    private int totaldim;



    public CodeGeneratorVisitor(PrintWriter pw) {
        varScope = new HashMap<String, ArrayList<Object>>();
        //varState = new HashMap<String, ArrayList<Double>>();
        varList = new ArrayList<String>();
        //sessCode = new ArrayList<String>();
        scopeCode = new ArrayList<ArrayList<String>>();
        this.pw = pw;
        TOCounter = 0;
        UOCounter = 0;
        currentScope = 0;
        totaldim = 1;

    }

    @Override
    public Value visitInteger(pWhileParser.IntegerContext ctx) {
        Value result = new Value();
        result.setValue(Integer.parseInt(ctx.getText()));
        return result;
    }

    @Override
    public Value visitBool(pWhileParser.BoolContext ctx){
        Value result = new Value();
        if (ctx.BOOL().getText().equals("true")){
            result.setValue(true);
        } else {
            result.setValue(false);
        }
        return result;
    }

    @Override
    public Value visitValueRange(pWhileParser.ValueRangeContext ctx) {

        if (ctx.getText().contains("..")) {
            ArrayList<Integer> valueRange = new ArrayList<Integer>();
            Integer fst = Integer.parseInt(ctx.INTEGER(0).getText());
            Integer lst = Integer.parseInt(ctx.INTEGER(1).getText());
            for (Integer i = fst; i < lst + 1; i++) {
                valueRange.add(i);
            }
            Value result = new Value();
            result.setValue(valueRange);
            return result;

        } else {
            if (ctx.expr(0).getText().equals("true") || ctx.expr(0).getText().equals("false")) {
                ArrayList<Boolean> valueRange = new ArrayList<Boolean>();
                for (pWhileParser.ExprContext expr : ctx.expr()) {

                    if (expr.getText().equals("true")) {
                        valueRange.add(true);
                    } else {
                        valueRange.add(false);
                    }
                }
                Value result = new Value();
                result.setValue(valueRange);
                return result;
            } else {
                ArrayList<Integer> valueRange = new ArrayList<Integer>();
                for (pWhileParser.ExprContext expr : ctx.expr()) {
                    valueRange.add(Integer.parseInt(expr.getText()));
                }
                Value result = new Value();
                result.setValue(valueRange);
                return result;
            }
        }
    }

    @Override
    public Value visitIdentifier(pWhileParser.IdentifierContext ctx) {
        Value result = new Value();
        ArrayList<Object> values = (ArrayList<Object>) varScope.get(ctx.IDENT().getText()).clone();
        result.setVarValues(values);

        return result;
    }

    @Override
    public Value visitDeclareVariable(pWhileParser.DeclareVariableContext ctx) {
        Value valueRange = visit(ctx.valueRange());
        varList.add(ctx.IDENT().getText());
        varScope.put(ctx.IDENT().getText(), (ArrayList<Object>) valueRange.getValue());
        totaldim = totaldim * ((ArrayList<Object>) valueRange.getValue()).size();
        int num = 1;
        for (ArrayList<Object> scope : varScope.values()) {
            num = num * scope.size();
        }
        pw.println("# Declare Variable Scopes");
        pw.println("sigma = tf.Variable(np.full((1," + num + "), 1.0/" + num + ", dtype=float), name = \"sigma\")");
        pw.println();
        return null;
    }


    @Override
    public Value visitAssignment(pWhileParser.AssignmentContext ctx) {

        Value value = visit(ctx.expr());

        if (value.valueUnknown()) {
            // if assignment contains variable
            /*
            ArrayList<Double> state = new ArrayList<Double>();

            for (int i = 0; i < varScope.get(ctx.IDENT().getText()).size(); i++) {
                if (((Pair<ArrayList<Object>, ArrayList<Double>>)value.getValue()).getKey().contains(varScope.get(ctx.IDENT().getText()).get(i))) {
                    state.add(((Pair<ArrayList<Object>, ArrayList<Double>>) value.getValue()).getValue().get(((
                            Pair<ArrayList<Object>, ArrayList<Double>>) value.getValue()).getKey().indexOf(varScope.get(ctx.IDENT().getText()).get(i))));
                } else {
                    state.add(0.0);
                }
            }
            varState.put(ctx.IDENT().getText(), state);
*/
            //index of variable
            int indexOfVar = -1;
            for (int i = 0; i < varList.size(); i++) {
                if (varList.get(i).equals(ctx.IDENT().getText())) {
                    indexOfVar = i + 1;
                }
            }

            pw.println("# Generate Update Operator");
/*
            pw.println("u" + " = np.zeros((" + varScope.get(ctx.IDENT().getText()).size() + ", " +
                    varScope.get(ctx.IDENT().getText()).size() + "))");
            for (int i = 0; i < varScope.get(ctx.IDENT().getText()).size(); i++) {
                //System.out.println(value.getValue());
                //System.out.println(varScope.get(ctx.IDENT().getText()));
                pw.println("u[" + i + ", " + varScope.get(ctx.IDENT().getText()).indexOf(((ArrayList<Object>)value.getValue()).get(i)) + "] = 1");
            }

            pw.println("updateOp = np.array([1.0])");

            //Tensor Product in Update Operator
            for (int i = 0; i < varList.size(); i++) {
                if (i + 1 != indexOfVar) {
                    pw.println("updateOp = np.kron(updateOp, np.identity(" + varScope.get(varList.get(i)).size() + "))");
                } else {
                    pw.println("updateOp = np.kron(updateOp, u" + ")");
                }
            }
*/

            pw.println("u = np.zeros((" + totaldim + ", " + totaldim + "))");
            int[] index = new int[varList.size()];
            for (int i = 0; i < totaldim; i++) {
                int divider = totaldim;
                int remainder = i;
                // look for current index of scope for each variable
                for (int varno = 0; varno < varList.size(); varno++) {
                    divider = divider / varScope.get(varList.get(varno)).size();
                    index[varno] = remainder / divider;
                    remainder = remainder % divider;
                }
                int indOfAssTo = varList.indexOf(ctx.IDENT().getText());
                int indOfAssFrom = -1;
                // assume expr() only contains one variable
                for (int v = 0; v < varList.size(); v++) {
                    if (ctx.expr().getText().contains(varList.get(v))) {
                        indOfAssFrom = varList.indexOf(varList.get(v));
                    }
                }

                // update the index of variable we assign to
                int temp = index[indOfAssTo];
                index[indOfAssTo] = varScope.get(varList.get(indOfAssTo)).indexOf(((ArrayList<Object>)value.getValue()).get(index[indOfAssFrom]));
                if (index[indOfAssTo] == -1) {
                    index[indOfAssTo] = temp;
                }
                // add up back
                
                remainder = 0;
                divider = totaldim;
                for (int varno = 0; varno < varList.size(); varno++) {
                    divider = divider / varScope.get(varList.get(varno)).size();
                    remainder += index[varno] * divider;


                }
                pw.println("u[" + i + ", " + remainder + "] = 1");


            }

            pw.println("updateOp = u");



            UOCounter++;
            pw.println("updateOp" + UOCounter + " = tf.Variable(updateOp)");
            pw.println();
            scopeCode.get(currentScope).add("    sigma = tf.matmul(sigma, updateOp" + UOCounter + ")");


        } else {
            // if assign a known value
            //ArrayList<Double> state = new ArrayList<Double>();
            //ArrayList<Object> scope = new ArrayList<Object>();
            // index of assigned value
            int indexOfAss = -1;
            for (int i = 0; i < varScope.get(ctx.IDENT().getText()).size(); i++) {
                if (varScope.get(ctx.IDENT().getText()).get(i).equals(value.getValue())) {
                    //state.add(1.0);
                    indexOfAss = i + 1;
                } else {
                    //state.add(0.0);
                }
            }

            //varState.put(ctx.IDENT().getText(), state);

            //index of variable
            int indexOfVar = -1;
            for (int i = 0; i < varList.size(); i++) {
                if (varList.get(i).equals(ctx.IDENT().getText())) {
                    indexOfVar = i + 1;
                }
            }
            pw.println("# Generate Update Operator");
            pw.println("u = np.zeros((" + varScope.get(ctx.IDENT().getText()).size() + ", " +
                    varScope.get(ctx.IDENT().getText()).size() + "))");
            pw.println("u[:, " + (indexOfAss - 1) + "] = 1");
            pw.println("updateOp = np.array([1.0])");

            //Tensor Product in Update Operator
            for (int i = 0; i < varList.size(); i++) {
                if (i + 1 != indexOfVar) {
                    pw.println("updateOp = np.kron(updateOp, np.identity(" + varScope.get(varList.get(i)).size() + "))");
                } else {
                    pw.println("updateOp = np.kron(updateOp, u)");
                }
            }

            UOCounter++;

            pw.println("updateOp" + UOCounter + " = tf.Variable(updateOp)");
            pw.println();

            scopeCode.get(currentScope).add("    sigma = tf.matmul(sigma, updateOp" + UOCounter + ")");

        }

        return null;
    }

    @Override
    public Value visitRandomAssignment(pWhileParser.RandomAssignmentContext ctx) {
        Value value = visit(ctx.valueRange());
        ArrayList<Object> valueRange = (ArrayList<Object>)value.getValue();

       // ArrayList<Double> state = new ArrayList<Double>();
        // index of assigned value
        ArrayList<Integer> indexOfAss = new ArrayList<Integer>();
        for (int i = 0; i < varScope.get(ctx.IDENT().getText()).size(); i++) {
            if ((valueRange).contains(varScope.get(ctx.IDENT().getText()).get(i))) {
                //state.add(1.0/valueRange.size());
                indexOfAss.add(i+1);
            } else {
                //state.add(0.0);
            }
        }

        //varState.put(ctx.IDENT().getText(), state);

        //index of variable
        int indexOfVar = -1;
        for (int i = 0; i < varList.size(); i++) {
            if (varList.get(i).equals(ctx.IDENT().getText())) {
                indexOfVar = i+1;
            }
        }
        pw.println("# Generate Update Operator");

        for (Integer indAss : indexOfAss) {
            pw.println("u_" + indAss + " = np.zeros((" + varScope.get(ctx.IDENT().getText()).size() + ", " +
                    varScope.get(ctx.IDENT().getText()).size() + "))");
            pw.println("u_" + indAss + "[:, " + (indAss - 1) + "] = 1");
            pw.println("uo" + (indexOfAss.indexOf(indAss) + 1) + " = np.array([1.0])");

            //Tensor Product in Update Operator
            for (int i = 0; i < varList.size(); i++) {
                if (i + 1 != indexOfVar) {
                    pw.println("uo" + (indexOfAss.indexOf(indAss) + 1) + " = np.kron(uo" + (indexOfAss.indexOf(indAss) + 1) + ", np.identity(" + varScope.get(varList.get(i)).size() + "))");
                } else {
                    pw.println("uo" + (indexOfAss.indexOf(indAss) + 1) + " = np.kron(uo" + (indexOfAss.indexOf(indAss) + 1) + ", u_" + indAss + ")");
                }
            }
        }
        UOCounter++;
        pw.print("updateOp" + UOCounter + " = tf.Variable(1.0/" + indexOfAss.size() + " * (");
        pw.print("uo" + 1);
        for (int i = 1; i < indexOfAss.size(); i++) {
            pw.print(" + uo" + (i+1));
        }
        pw.println("))");
        pw.println();
        scopeCode.get(currentScope).add("    sigma = tf.matmul(sigma, updateOp" + UOCounter + ")");


        return null;
    }

    @Override
    public Value visitStatlist(pWhileParser.StatlistContext ctx) {
        return visitChildren(ctx);
    }

    //UO
    @Override
    public Value visitBinOp1Expr(pWhileParser.BinOp1ExprContext ctx) {
        //MUL, DIV, MOD

        Value e1 = visit(ctx.expr(0));
        Value e2 = visit(ctx.expr(1));

        Value result = new Value();

        //both value known
        if (e1.valueKnown() && e2.valueKnown()) {
            if (ctx.binOpP1().getText().equals("*")){
                result.setValue(((int)e1.getValue()) * ((int)e2.getValue()));
            } else if (ctx.binOpP1().getText().equals("/")) {
                result.setValue(((int)e1.getValue()) / ((int)e2.getValue()));
            } else if (ctx.binOpP1().getText().equals("%")) {
                result.setValue(((int)e1.getValue()) % ((int)e2.getValue()));
            }
        } else if (e1.valueUnknown() && e2.valueKnown()) {
            ArrayList<Object> left = (ArrayList<Object>) ((ArrayList<Object>)e1.getValue()).clone();
            for (int i = 0; i < left.size(); i++) {
                if (ctx.binOpP1().getText().equals("*")){
                    left.set(i, (int)left.get(i) * (int)e2.getValue());
                } else if (ctx.binOpP1().getText().equals("/")) {
                    left.set(i, (int)left.get(i) / (int)e2.getValue());
                } else if (ctx.binOpP1().getText().equals("%")) {
                    left.set(i, (int)left.get(i) % (int)e2.getValue());
                }
            }
            result.setVarValues(left);
        } else if (e1.valueKnown() && e2.valueUnknown()) {
            ArrayList<Object> left = (ArrayList<Object>) ((ArrayList<Object>)e2.getValue()).clone();
            for (int i = 0; i < left.size(); i++) {
                if (ctx.binOpP1().getText().equals("*")){
                    left.set(i, (int)e1.getValue() * (int)left.get(i));
                } else if (ctx.binOpP1().getText().equals("/")) {
                    left.set(i, (int)e1.getValue() / (int)left.get(i));
                } else if (ctx.binOpP1().getText().equals("%")) {
                    left.set(i, (int)e1.getValue() % (int)left.get(i));
                }
            }
            result.setVarValues(left);
        } //should not have two unknown values, in which case dimension will change
        return result;

    }

    //UO
    @Override
    public Value visitBinOp2Expr(pWhileParser.BinOp2ExprContext ctx) {
        //PLUS, MINUS

        Value e1 = visit(ctx.expr(0));
        Value e2 = visit(ctx.expr(1));

        Value result = new Value();

        if (e1.valueKnown() && e2.valueKnown()) {
            if (ctx.binOpP2().getText().equals("+")){
                result.setValue(((int)e1.getValue()) + ((int)e2.getValue()));
            } else if (ctx.binOpP2().getText().equals("-")) {
                result.setValue(((int)e1.getValue()) - ((int)e2.getValue()));
            }
        } else if (e1.valueUnknown() && e2.valueKnown()) {
            ArrayList<Object> left = (ArrayList<Object>) ((ArrayList<Object>)e1.getValue()).clone();
            for (int i = 0; i < left.size(); i++) {
                if (ctx.binOpP2().getText().equals("+")) {
                    left.set(i, (int)left.get(i) + (int)e2.getValue());
                } else if (ctx.binOpP2().getText().equals("-")) {
                    left.set(i, (int)left.get(i) - (int)e2.getValue());
                }
            }
            result.setVarValues(left);

        } else if (e1.valueKnown() && e2.valueUnknown()) {
            ArrayList<Object> left = (ArrayList<Object>) ((ArrayList<Object>)e2.getValue()).clone();
            for (int i = 0; i < left.size(); i++) {
                if (ctx.binOpP2().getText().equals("+")) {
                    left.set(i, (int) e1.getValue() + (int) left.get(i));
                } else if (ctx.binOpP2().getText().equals("-")) {
                    left.set(i, (int) e1.getValue() - (int) left.get(i));
                }
            }
            result.setVarValues(left);

        } //should not have two unknown values, in which case dimension will change
        return result;

    }

    //TO
    @Override
    public Value visitBinOp3Expr(pWhileParser.BinOp3ExprContext ctx) {
        //GT, GTE, LT, LTE

        Value e1 = visit(ctx.expr(0));
        Value e2 = visit(ctx.expr(1));

        Value result = new Value();

        /*
        //both value known
        if (e1.valueKnown() && e2.valueKnown()) {
            if (ctx.binOpP3().getText().equals(">")) {
                if (((int) e1.getValue()) > ((int) e2.getValue())) {
                    result.setValue(true);
                } else {
                    result.setValue(false);
                }
            } else if (ctx.binOpP3().getText().equals(">=")) {
                if (((int) e1.getValue()) >= ((int) e2.getValue())) {
                    result.setValue(true);
                } else {
                    result.setValue(false);
                }
            } else if (ctx.binOpP3().getText().equals("<")) {
                if (((int) e1.getValue()) < ((int) e2.getValue())) {
                    result.setValue(true);
                } else {
                    result.setValue(false);
                }
            } else if (ctx.binOpP3().getText().equals("<=")) {
                if (((int) e1.getValue()) <= ((int) e2.getValue())) {
                    result.setValue(true);
                } else {
                    result.setValue(false);
                }
            }
        } else */
        if (e1.valueUnknown() && e2.valueKnown()) {
            pw.println("# Generate Test Operator");
            int dim = ((ArrayList<Object>)e1.getValue()).size();
            pw.println("t = np.zeros((" + dim + ", " + dim + "))");
            if (ctx.binOpP3().getText().equals(">")) {
                for (int i = 0; i < dim; i++) {
                    if ((int) ((ArrayList<Object>)e1.getValue()).get(i) > (int) e2.getValue()) {
                        pw.println("t[" + i + ", " + i + "] = 1");
                    }
                }
            } else if (ctx.binOpP3().getText().equals(">=")) {
                for (int i = 0; i < dim; i++) {
                    if ((int) ((ArrayList<Object>)e1.getValue()).get(i) >= (int) e2.getValue()) {
                        pw.println("t[" + i + ", " + i + "] = 1");
                    }
                }
            } else if (ctx.binOpP3().getText().equals("<")) {
                for (int i = 0; i < dim; i++) {
                    if ((int) ((ArrayList<Object>)e1.getValue()).get(i) < (int) e2.getValue()) {
                        pw.println("t[" + i + ", " + i + "] = 1");
                    }
                }
            } else if (ctx.binOpP3().getText().equals("<=")) {
                for (int i = 0; i < dim; i++) {
                    if ((int) ((ArrayList<Object>)e1.getValue()).get(i) <= (int) e2.getValue()) {
                        pw.println("t[" + i + ", " + i + "] = 1");
                    }
                }
            }
            pw.println("testOp = np.array([1.0])");
            for (int i = 0; i < varList.size(); i++) {
                if (varList.get(i).equals(ctx.expr(0).getText())) {
                    pw.println("testOp =  np.kron(testOp, t)");
                } else {

                    pw.println("testOp =  np.kron(testOp, np.identity(" + varScope.get(varList.get(i)).size() + "))");
                }
            }
            TOCounter++;
            pw.println("testTemp" + TOCounter + " = testOp");
            pw.println("testOp" + TOCounter + " = tf.Variable(testOp)");
            /*
            int totaldim = 1;
            for (String varname : varList) {
                totaldim = totaldim * varScope.get(varname).size();
            }
            */
            pw.println("testNOp" + TOCounter + " = tf.Variable(np.identity(" + totaldim + ") - testOp)");
            pw.println();

            //result.setValue(OpCounter);
        } else if (e1.valueKnown() && e2.valueUnknown()) {
            pw.println("# Generate Test Operator");
            int dim = ((ArrayList<Object>)e2.getValue()).size();
            pw.println("t = np.zeros((" + dim + ", " + dim + "))");
            if (ctx.binOpP3().getText().equals(">")) {
                for (int i = 0; i < dim; i++) {
                    if ((int) ((ArrayList<Object>)e2.getValue()).get(i) < (int) e1.getValue()) {
                        pw.println("t[" + i + ", " + i + "] = 1");
                    }
                }
            } else if (ctx.binOpP3().getText().equals(">=")) {
                for (int i = 0; i < dim; i++) {
                    if ((int) ((ArrayList<Object>)e2.getValue()).get(i) <= (int) e1.getValue()) {
                        pw.println("t[" + i + ", " + i + "] = 1");
                    }
                }
            } else if (ctx.binOpP3().getText().equals("<")) {
                for (int i = 0; i < dim; i++) {
                    if ((int) ((ArrayList<Object>)e2.getValue()).get(i) > (int) e1.getValue()) {
                        pw.println("t[" + i + ", " + i + "] = 1");
                    }
                }
            } else if (ctx.binOpP3().getText().equals("<=")) {
                for (int i = 0; i < dim; i++) {
                    if ((int) ((ArrayList<Object>)e2.getValue()).get(i) >= (int) e1.getValue()) {
                        pw.println("t[" + i + ", " + i + "] = 1");
                    }
                }
            }
            pw.println("testOp = np.array([1.0])");
            for (int i = 0; i < varList.size(); i++) {
                if (varList.get(i).equals(ctx.expr(1).getText())) {
                    pw.println("testOp =  np.kron(testOp, t)");
                } else {

                    pw.println("testOp =  np.kron(testOp, np.identity(" + varScope.get(varList.get(i)).size() + "))");
                }
            }
            TOCounter++;
            pw.println("testTemp" + TOCounter + " = testOp");
            pw.println("testOp" + TOCounter + " = tf.Variable(testOp)");
            /*
            int totaldim = 1;
            for (String varname : varList) {
                totaldim = totaldim * varScope.get(varname).size();
            }
            */
            pw.println("testNOp" + TOCounter + " = tf.Variable(np.identity(" + totaldim + ") - testOp)");
            pw.println();
        } else if (e1.valueUnknown() && e2.valueUnknown()) {
            pw.println("# Generate Test Operator");
            int dim1 = ((ArrayList<Object>) e1.getValue()).size();
            int dim2 = ((ArrayList<Object>) e2.getValue()).size();
            pw.println("testOp = np.zeros((" + totaldim + ", " + totaldim + "))");

            if (ctx.binOpP3().getText().equals(">")) {
                for (int i = 0; i < dim1; i++) {
                    for (int j = 0; j < dim2; j++) {
                        if (((int) ((ArrayList<Object>) e1.getValue()).get(i)) > ((int) ((ArrayList<Object>) e2.getValue()).get(j))) {
                            pw.println("t1 = np.zeros((" + dim1 + ", " + dim1 + "))");
                            pw.println("t2 = np.zeros((" + dim2 + ", " + dim2 + "))");
                            pw.println("t1[" + i + ", " + i + "] = 1");
                            pw.println("t2[" + j + ", " + j + "] = 1");
                            pw.println("t = np.array([1.0])");
                            for (int k = 0; k < varList.size(); k++) {
                                if (varList.get(k).equals(ctx.expr(0).getText())) {
                                    pw.println("t = np.kron(t, t1)");
                                } else if (varList.get(k).equals(ctx.expr(1).getText())) {
                                    pw.println("t = np.kron(t, t2)");
                                } else {
                                    pw.println("t = np.kron(t, np.identity(" + varScope.get(varList.get(k)).size() + "))");
                                }
                            }
                            pw.println("testOp = testOp + t");
                        }

                    }

                }
            } else if (ctx.binOpP3().getText().equals(">=")) {
                for (int i = 0; i < dim1; i++) {
                    for (int j = 0; j < dim2; j++) {
                        if (((int) ((ArrayList<Object>) e1.getValue()).get(i)) >= ((int) ((ArrayList<Object>) e2.getValue()).get(j))) {
                            pw.println("t1 = np.zeros((" + dim1 + ", " + dim1 + "))");
                            pw.println("t2 = np.zeros((" + dim2 + ", " + dim2 + "))");
                            pw.println("t1[" + i + ", " + i + "] = 1");
                            pw.println("t2[" + j + ", " + j + "] = 1");
                            pw.println("t = np.array([1.0])");
                            for (int k = 0; k < varList.size(); k++) {
                                if (varList.get(k).equals(ctx.expr(0).getText())) {
                                    pw.println("t = np.kron(t, t1)");
                                } else if (varList.get(k).equals(ctx.expr(1).getText())) {
                                    pw.println("t = np.kron(t, t2)");
                                } else {
                                    pw.println("t = np.kron(t, np.identity(" + varScope.get(varList.get(k)).size() + "))");
                                }
                            }
                            pw.println("testOp = testOp + t");
                        }

                    }

                }
            } else if (ctx.binOpP3().getText().equals("<")) {
                for (int i = 0; i < dim1; i++) {
                    for (int j = 0; j < dim2; j++) {
                        if (((int) ((ArrayList<Object>) e1.getValue()).get(i)) < ((int) ((ArrayList<Object>) e2.getValue()).get(j))) {
                            pw.println("t1 = np.zeros((" + dim1 + ", " + dim1 + "))");
                            pw.println("t2 = np.zeros((" + dim2 + ", " + dim2 + "))");
                            pw.println("t1[" + i + ", " + i + "] = 1");
                            pw.println("t2[" + j + ", " + j + "] = 1");
                            pw.println("t = np.array([1.0])");
                            for (int k = 0; k < varList.size(); k++) {
                                if (varList.get(k).equals(ctx.expr(0).getText())) {
                                    pw.println("t = np.kron(t, t1)");
                                } else if (varList.get(k).equals(ctx.expr(1).getText())) {
                                    pw.println("t = np.kron(t, t2)");
                                } else {
                                    pw.println("t = np.kron(t, np.identity(" + varScope.get(varList.get(k)).size() + "))");
                                }
                            }
                            pw.println("testOp = testOp + t");
                        }

                    }

                }
            } else if (ctx.binOpP3().getText().equals("<=")) {
                for (int i = 0; i < dim1; i++) {
                    for (int j = 0; j < dim2; j++) {
                        if (((int) ((ArrayList<Object>) e1.getValue()).get(i)) <= ((int) ((ArrayList<Object>) e2.getValue()).get(j))) {
                            pw.println("t1 = np.zeros((" + dim1 + ", " + dim1 + "))");
                            pw.println("t2 = np.zeros((" + dim2 + ", " + dim2 + "))");
                            pw.println("t1[" + i + ", " + i + "] = 1");
                            pw.println("t2[" + j + ", " + j + "] = 1");
                            pw.println("t = np.array([1.0])");
                            for (int k = 0; k < varList.size(); k++) {
                                if (varList.get(k).equals(ctx.expr(0).getText())) {
                                    pw.println("t = np.kron(t, t1)");
                                } else if (varList.get(k).equals(ctx.expr(1).getText())) {
                                    pw.println("t = np.kron(t, t2)");
                                } else {
                                    pw.println("t = np.kron(t, np.identity(" + varScope.get(varList.get(k)).size() + "))");
                                }
                            }
                            pw.println("testOp = testOp + t");
                        }

                    }

                }
            }
            TOCounter++;
            pw.println("testTemp" + TOCounter + " = testOp");
            pw.println("testOp" + TOCounter + " = tf.Variable(testOp)");

            pw.println("testNOp" + TOCounter + " = tf.Variable(np.identity(" + totaldim + ") - testOp)");
            pw.println();

        }

        result.setValue(TOCounter);
        return result;

    }

    //TO
    @Override
    public Value visitBinOp4Expr(pWhileParser.BinOp4ExprContext ctx) {
        //EQ, NEQ

        Value e1 = visit(ctx.expr(0));
        Value e2 = visit(ctx.expr(1));

        Value result = new Value();

        /*
        //both value known
        if (e1.valueKnown() && e2.valueKnown()) {
            if (ctx.binOpP4().getText().equals("==")){
                if (e1.getValue().equals(e2.getValue())) {
                    result.setValue(true);
                } else {
                    result.setValue(false);
                }
            } else if (ctx.binOpP4().getText().equals("!=")) {
                if (e1.getValue().equals(e2.getValue())) {
                    result.setValue(false);
                } else {
                    result.setValue(true);
                }
            }

            //do nothing
        } else*/
        if (e1.valueUnknown() && e2.valueKnown()) {
            pw.println("# Generate Test Operator");
            int dim = ((ArrayList<Object>)e1.getValue()).size();
            pw.println("t = np.zeros((" + dim + ", " + dim + "))");
            if (ctx.binOpP4().getText().equals("==")) {
                for (int i = 0; i < dim; i++) {
                    if (((ArrayList<Object>)e1.getValue()).get(i).equals(e2.getValue())) {
                        pw.println("t[" + i + ", " + i + "] = 1");
                    }
                }
            } else if (ctx.binOpP4().getText().equals("!=")) {
                for (int i = 0; i < dim; i++) {
                    if (!((ArrayList<Object>)e1.getValue()).get(i).equals(e2.getValue())) {
                        pw.println("t[" + i + ", " + i + "] = 1");
                    }
                }
            }
            pw.println("testOp = np.array([1.0])");
            for (int i = 0; i < varList.size(); i++) {
                if (varList.get(i).equals(ctx.expr(0).getText())) {
                    pw.println("testOp =  np.kron(testOp, t)");

                } else {
                    pw.println("testOp =  np.kron(testOp, np.identity(" + varScope.get(varList.get(i)).size() + "))");
                }
            }
            TOCounter++;
            pw.println("testTemp" + TOCounter + " = testOp");
            pw.println("testOp" + TOCounter + " = tf.Variable(testOp)");
            /*
            int totaldim = 1;
            for (String varname : varList) {
                totaldim = totaldim * varScope.get(varname).size();
            }
            */
            pw.println("testNOp" + TOCounter + " = tf.Variable(np.identity(" + totaldim + ") - testOp)");

            pw.println();
            //result.setValue(OpCounter);
        } else  if (e1.valueKnown() && e2.valueUnknown()) {
            pw.println("# Generate Test Operator");
            int dim = ((ArrayList<Object>)e2.getValue()).size();
            pw.println("t = np.zeros((" + dim + ", " + dim + "))");
            if (ctx.binOpP4().getText().equals("==")) {
                for (int i = 0; i < dim; i++) {
                    if (((ArrayList<Object>)e2.getValue()).get(i).equals(e1.getValue())) {
                        pw.println("t[" + i + ", " + i + "] = 1");
                    }
                }
            } else if (ctx.binOpP4().getText().equals("!=")) {
                for (int i = 0; i < dim; i++) {
                    if (!((ArrayList<Object>)e2.getValue()).get(i).equals(e1.getValue())) {
                        pw.println("t[" + i + ", " + i + "] = 1");
                    }
                }
            }
            pw.println("testOp = np.array([1.0])");
            for (int i = 0; i < varList.size(); i++) {
                if (varList.get(i).equals(ctx.expr(1).getText())) {
                    pw.println("testOp =  np.kron(testOp, t)");

                } else {
                    pw.println("testOp =  np.kron(testOp, np.identity(" + varScope.get(varList.get(i)).size() + "))");
                }
            }
            TOCounter++;
            pw.println("testTemp" + TOCounter + " = testOp");
            pw.println("testOp" + TOCounter + " = tf.Variable(testOp)");
            /*
            int totaldim = 1;
            for (String varname : varList) {
                totaldim = totaldim * varScope.get(varname).size();
            }
            */
            pw.println("testNOp" + TOCounter + " = tf.Variable(np.identity(" + totaldim + ") - testOp)");

            pw.println();
            //result.setValue(OpCounter);
        } else if (e1.valueUnknown() && e2.valueUnknown()) {
            pw.println("# Generate Test Operator");
            int dim1 = ((ArrayList<Object>)e1.getValue()).size();
            int dim2 = ((ArrayList<Object>)e2.getValue()).size();
            pw.println("testOp = np.zeros((" + totaldim + ", " + totaldim + "))");

            if (ctx.binOpP4().getText().equals("==")) {
                for (int i = 0; i < dim1; i++) {
                    for (int j = 0; j < dim2; j++) {
                        if (((ArrayList<Object>)e1.getValue()).get(i).equals(((ArrayList<Object>)e2.getValue()).get(j))) {
                            pw.println("t1 = np.zeros((" + dim1 + ", " + dim1 + "))");
                            pw.println("t2 = np.zeros((" + dim2 + ", " + dim2 + "))");
                            pw.println("t1[" + i + ", " + i + "] = 1");
                            pw.println("t2[" + j + ", " + j + "] = 1");
                            pw.println("t = np.array([1.0])");
                            for (int k = 0; k < varList.size(); k++) {
                                if (varList.get(k).equals(ctx.expr(0).getText())) {
                                    pw.println("t = np.kron(t, t1)");
                                } else if (varList.get(k).equals(ctx.expr(1).getText())) {
                                    pw.println("t = np.kron(t, t2)");
                                } else {
                                    pw.println("t = np.kron(t, np.identity(" + varScope.get(varList.get(k)).size() + "))");
                                }
                            }
                            pw.println("testOp = testOp + t");
                        }

                    }

                }
            } else if (ctx.binOpP4().getText().equals("!=")) {
                for (int i = 0; i < dim1; i++) {
                    for (int j = 0; j < dim2; j++) {
                        if (!((ArrayList<Object>)e1.getValue()).get(i).equals(((ArrayList<Object>)e2.getValue()).get(j))) {
                            pw.println("t1 = np.zeros((" + dim1 + ", " + dim1 + "))");
                            pw.println("t2 = np.zeros((" + dim2 + ", " + dim2 + "))");
                            pw.println("t1[" + i + ", " + i + "] = 1");
                            pw.println("t2[" + j + ", " + j + "] = 1");
                            pw.println("t = np.array([1.0])");
                            for (int k = 0; k < varList.size(); k++) {
                                if (varList.get(k).equals(ctx.expr(0).getText())) {
                                    pw.println("t = np.kron(t, t1)");
                                } else if (varList.get(k).equals(ctx.expr(1).getText())) {
                                    pw.println("t = np.kron(t, t2)");
                                } else {
                                    pw.println("t = np.kron(t, np.identity(" + varScope.get(varList.get(k)).size() + "))");
                                }
                            }
                            pw.println("testOp = testOp + t");
                        }

                    }

                }

            }
            TOCounter++;
            pw.println("testTemp" + TOCounter + " = testOp");
            pw.println("testOp" + TOCounter + " = tf.Variable(testOp)");

            pw.println("testNOp" + TOCounter + " = tf.Variable(np.identity(" + totaldim + ") - testOp)");
            pw.println();

        }
        result.setValue(TOCounter);
        return result;

    }

    //TO
    @Override
    public Value visitBinOp5Expr(pWhileParser.BinOp5ExprContext ctx) {
        //AND

        Value count1 = visit(ctx.expr(0));
        Value count2 = visit(ctx.expr(1));

        Value result = new Value();


        TOCounter++;

        pw.println("# Generate Test Operator");
        pw.println("testOp = np.dot(testTemp" + count1.getValue() + ", testTemp" + count2.getValue() + ")");
        pw.println("testTemp" + TOCounter + " = testOp");
        pw.println("testOp" + TOCounter + " = tf.Variable(testOp)");
        /*
        int totaldim = 1;
        for (String varname : varList) {
            totaldim = totaldim * varScope.get(varname).size();
        }
        */
        pw.println("testNOp" + TOCounter + " = tf.Variable(np.identity(" + totaldim + ") - testOp)");
        pw.println();

        /*
        //both value known
        if (e1.valueKnown() && e2.valueKnown()) {
            if (ctx.binOpP5().getText().equals("&&")){
                if (((boolean)e1.getValue()) && ((boolean)e2.getValue())) {
                    result.setValue(true);
                } else {
                    result.setValue(false);
                }
            }
        }*/
        result.setValue(TOCounter);
        return result;

    }

    //TO
    @Override
    public Value visitBinOp6Expr(pWhileParser.BinOp6ExprContext ctx) {
        //OR

        Value count1 = visit(ctx.expr(0));
        Value count2 = visit(ctx.expr(1));

        Value result = new Value();

        TOCounter++;
        /*
        int totaldim = 1;
        for (String varname : varList) {
            totaldim = totaldim * varScope.get(varname).size();
        }
        */

        pw.println("# Generate Test Operator");
        pw.println("testOp = np.zeros((" + totaldim + ", " + totaldim + "))");
        pw.println("for i in range(" + totaldim + "):");
        pw.println("    if testTemp" + count1.getValue() + "[i, i] == 1 or testTemp" + count2.getValue() + "[i, i] == 1:");
        pw.println("        testOp[i, i] = 1");
        pw.println("testTemp" + TOCounter + " = testOp");
        pw.println("testOp" + TOCounter + " = tf.Variable(testOp)");
        pw.println("testNOp" + TOCounter + " = tf.Variable(np.identity(" + totaldim + ") - testOp)");
        pw.println();

        /*
        //both value known
        if (e1.valueKnown() && e2.valueKnown()) {
            if (ctx.binOpP6().getText().equals("||")){
                if (((boolean)e1.getValue()) || ((boolean)e2.getValue())) {
                    result.setValue(true);
                } else {
                    result.setValue(false);
                }
            }
        }*/
        result.setValue(TOCounter);
        return result;

    }

    @Override
    public Value visitUnaryOpExpr(pWhileParser.UnaryOpExprContext ctx) {
        //MINUS, NOT
        Value e = visit(ctx.expr());

        Value result = new Value();

        //value know
        if (e.valueKnown()) {
            if (ctx.unaryOp().getText().equals("-")) {
                result.setValue(-((int)e.getValue()));
            } else if (ctx.unaryOp().getText().equals("!")) {
                if ((boolean)e.getValue()) {
                    result.setValue(false);
                } else {
                    result.setValue(true);
                }
            }
        }
        return result;
    }

    @Override
    public Value visitNestedExpr(pWhileParser.NestedExprContext ctx) {
        return visit(ctx.expr());
    }



    @Override
    public Value visitIf(pWhileParser.IfContext ctx) {
        // accepts only one line of statement in first stat and second stat respectively
        // according to Tensorflow tf.cond grammar
        // IMPORTANT: currentScope is not incremented in this version
        visit(ctx.expr());
        int testOpCount = TOCounter;
        /* Tensorflow tf.cond grammar is not suitable here
        currentScope++;
        if (scopeCode.size() <= currentScope) {
            scopeCode.add(new ArrayList<String >());
        }

        visit(ctx.stat(0));
        pw.println("# Define IF Statement");

        pw.println("def condition" + testOpCount + "(sigma):");
        pw.println("    sigma = tf.matmul(sigma, testOp" + testOpCount + ")");

        pw.println("    return tf.logical_not(tf.reduce_all(tf.equal(sigma, tf.zeros([" + totaldim + "], dtype=tf.float64))))");

        pw.println("def then" + testOpCount + "(sigma):");
        // ifcode
        for (String code : scopeCode.get(currentScope)) {
            pw.println(code);
        }
        scopeCode.get(currentScope).clear();

        pw.println("    return sigma");
        pw.println();

        visit(ctx.stat(1));

        pw.println("# Continue Defining IF");
        pw.println("def else" + testOpCount + "(sigma):");
        // ifcode
        for (String code : scopeCode.get(currentScope)) {
            pw.println(code);
        }
        scopeCode.get(currentScope).clear();

        pw.println("    return sigma");
        pw.println();

        currentScope--;

        scopeCode.get(currentScope).add("    sigma = tf.cond(condition" + testOpCount + "(sigma), lambda: then" + testOpCount + "(sigma), lambda: else" + testOpCount + "(sigma))");
*/
        scopeCode.get(currentScope).add("    sigma" + testOpCount + "_ogn = sigma");
        scopeCode.get(currentScope).add("    sigma = tf.matmul(sigma, testOp" + testOpCount + ")");
        visit(ctx.stat(0));
        scopeCode.get(currentScope).add("    sigma" + testOpCount + "_then = sigma");
        scopeCode.get(currentScope).add("    sigma = tf.matmul(sigma" + testOpCount + "_ogn, testNOp" + testOpCount + ")");
        visit(ctx.stat(1));
        scopeCode.get(currentScope).add("    sigma" + testOpCount + "_else = sigma");
        scopeCode.get(currentScope).add("    sigma = tf.add(sigma" + testOpCount + "_then, sigma" + testOpCount + "_else)");

        return null;
    }

    @Override
    public Value visitWhile(pWhileParser.WhileContext ctx) {

        if (!ctx.expr().getText().equals("true") && ctx.INTEGER() == null && ctx.pr() == null) {
            visit(ctx.expr());
            int testOpCount = TOCounter;
            currentScope++;
            if (scopeCode.size() <= currentScope) {
                scopeCode.add(new ArrayList<String >());
            }

            visit(ctx.stat());

            pw.println("# Define WHILE Statement");
            pw.println("def condition" + testOpCount + "(sigma):");
            pw.println("    sigma = tf.matmul(sigma, testOp" + testOpCount + ")");

            pw.println("    return tf.logical_not(tf.reduce_all(tf.equal(sigma, tf.zeros([" + totaldim + "], dtype=tf.float64))))");

            pw.println("def body" + testOpCount + "(sigma):");
            pw.println("    outOfLoop = tf.matmul(sigma, testNOp" + testOpCount + ")");
            pw.println("    sigma = tf.matmul(sigma, " + "testOp" + testOpCount + ")");
            // whilecode
            for (String code : scopeCode.get(currentScope)) {
                pw.println(code);
            }
            scopeCode.get(currentScope).clear();

            pw.println("    sigma = tf.add(sigma, outOfLoop)");
            pw.println("    return sigma");
            pw.println();

            currentScope--;

            scopeCode.get(currentScope).add("    sigma = tf.while_loop(condition" + testOpCount + ", body" + testOpCount + ", [sigma])");

        } else if (!ctx.expr().getText().equals("true") && ctx.INTEGER() != null && ctx.pr() == null) {

            int limit = Integer.parseInt(ctx.INTEGER().getText());
            visit(ctx.expr());
            int testOpCount = TOCounter;
            currentScope++;
            if (scopeCode.size() <= currentScope) {
                scopeCode.add(new ArrayList<String >());
            }

            visit(ctx.stat());

            pw.println("# Define WHILE Statement");
            pw.println("loopCount" + testOpCount + " = tf.Variable(0)");
            pw.println("def condition" + testOpCount + "(sigma, loopCount" + testOpCount + "):");
            pw.println("    sigma = tf.matmul(sigma, testOp" + testOpCount + ")");

            pw.println("    return tf.logical_and(tf.logical_not(tf.reduce_all(tf.equal(sigma, tf.zeros([" + totaldim + "], " +
                    "dtype=tf.float64)))), tf.less(loopCount" + testOpCount + ", tf.constant(" + limit + ")))");

            pw.println("def body" + testOpCount + "(sigma, loopCount" + testOpCount + "):");
            pw.println("    loopCount" + testOpCount + " = tf.add(loopCount" + testOpCount + ", tf.constant(1))");
            pw.println("    outOfLoop = tf.matmul(sigma, testNOp" + testOpCount + ")");
            pw.println("    sigma = tf.matmul(sigma, " + "testOp" + testOpCount + ")");
            // whilecode
            for (String code : scopeCode.get(currentScope)) {
                pw.println(code);
            }
            scopeCode.get(currentScope).clear();

            pw.println("    sigma = tf.add(sigma, outOfLoop)");
            pw.println("    return sigma, loopCount" + testOpCount);
            pw.println();

            currentScope--;

            scopeCode.get(currentScope).add("    sigma, loopCount" + testOpCount + " = tf.while_loop(condition" + testOpCount + ", body" + testOpCount + ", [sigma, loopCount" + testOpCount + "])");

        } else if (!ctx.expr().getText().equals("true") && ctx.INTEGER() == null && ctx.pr() != null) {

            visit(ctx.expr());
            int testOpCount = TOCounter;
            currentScope++;
            if (scopeCode.size() <= currentScope) {
                scopeCode.add(new ArrayList<String >());
            }

            double epsilon = (double) visit(ctx.pr()).getValue();

            visit(ctx.stat());


            pw.println("# Define WHILE Statement");
            pw.println("epsilon" + testOpCount + " = tf.Variable(" + epsilon + ", dtype=tf.float64)");
            pw.println("def condition" + testOpCount + "(sigma):");
            pw.println("    remain = tf.reduce_sum(sigma)");
            pw.println("    sigma = tf.matmul(sigma, testOp" + testOpCount + ")");

            pw.println("    return tf.logical_and(tf.logical_not(tf.reduce_all(tf.equal(sigma, tf.zeros([" + totaldim + "], dtype=tf.float64)))), tf.greater(remain, epsilon" + testOpCount + "))");

            pw.println("def body" + testOpCount + "(sigma):");
            pw.println("    outOfLoop = tf.matmul(sigma, testNOp" + testOpCount + ")");
            pw.println("    sigma = tf.matmul(sigma, " + "testOp" + testOpCount + ")");
            // whilecode
            for (String code : scopeCode.get(currentScope)) {
                pw.println(code);
            }
            scopeCode.get(currentScope).clear();

            pw.println("    sigma = tf.add(sigma, outOfLoop)");
            pw.println("    return sigma");
            pw.println();

            currentScope--;

            scopeCode.get(currentScope).add("    sigma = tf.while_loop(condition" + testOpCount + ", body" + testOpCount + ", [sigma])");

        } else if (!ctx.expr().getText().equals("true") && ctx.INTEGER() != null && ctx.pr() != null) {
            int limit = Integer.parseInt(ctx.INTEGER().getText());
            visit(ctx.expr());
            int testOpCount = TOCounter;
            currentScope++;
            if (scopeCode.size() <= currentScope) {
                scopeCode.add(new ArrayList<String >());
            }

            double epsilon = (double) visit(ctx.pr()).getValue();

            visit(ctx.stat());

            pw.println("# Define WHILE Statement");
            pw.println("epsilon" + testOpCount + " = tf.Variable(" + epsilon + ", dtype=tf.float64)");
            pw.println("loopCount" + testOpCount + " = tf.Variable(0)");
            pw.println("def condition" + testOpCount + "(sigma, loopCount" + testOpCount + "):");
            pw.println("    remain = tf.reduce_sum(sigma)");
            pw.println("    sigma = tf.matmul(sigma, testOp" + testOpCount + ")");

            pw.println("    return tf.logical_and(tf.logical_and(tf.logical_not(tf.reduce_all(tf.equal(sigma, tf.zeros([" + totaldim + "], " +
                    "dtype=tf.float64)))), tf.less(loopCount" + testOpCount + ", tf.constant(" + limit + "))), tf.greater(remain, epsilon" + testOpCount + "))");

            pw.println("def body" + testOpCount + "(sigma, loopCount" + testOpCount + "):");
            pw.println("    loopCount" + testOpCount + " = tf.add(loopCount" + testOpCount + ", tf.constant(1))");
            pw.println("    outOfLoop = tf.matmul(sigma, testNOp" + testOpCount + ")");
            pw.println("    sigma = tf.matmul(sigma, " + "testOp" + testOpCount + ")");
            // whilecode
            for (String code : scopeCode.get(currentScope)) {
                pw.println(code);
            }
            scopeCode.get(currentScope).clear();

            pw.println("    sigma = tf.add(sigma, outOfLoop)");
            pw.println("    return sigma, loopCount" + testOpCount);
            pw.println();

            currentScope--;

            scopeCode.get(currentScope).add("    sigma, loopCount" + testOpCount + " = tf.while_loop(condition" + testOpCount + ", body" + testOpCount + ", [sigma, loopCount" + testOpCount + "])");

        } else if (ctx.expr().getText().equals("true") && ctx.INTEGER() == null && ctx.pr() == null){
            // should not have this situation

        }  else if (ctx.expr().getText().equals("true") && ctx.INTEGER() != null && ctx.pr() == null) {

            int limit = Integer.parseInt(ctx.INTEGER().getText());


            int testOpCount = TOCounter;
            currentScope++;
            if (scopeCode.size() <= currentScope) {
                scopeCode.add(new ArrayList<String >());
            }

            visit(ctx.stat());

            pw.println("# Define WHILE Statement");
            pw.println("loopCount" + testOpCount + " = tf.Variable(0)");
            pw.println("def condition" + testOpCount + "(sigma, loopCount" + testOpCount + "):");

            pw.println("    return tf.less(loopCount" + testOpCount + ", tf.constant(" + limit + "))");

            pw.println("def body" + testOpCount + "(sigma, loopCount" + testOpCount + "):");
            pw.println("    loopCount" + testOpCount + " = tf.add(loopCount" + testOpCount + ", tf.constant(1))");
            // whilecode
            for (String code : scopeCode.get(currentScope)) {
                pw.println(code);
            }
            scopeCode.get(currentScope).clear();

            pw.println("    return sigma, loopCount" + testOpCount);
            pw.println();

            currentScope--;

            scopeCode.get(currentScope).add("    sigma, loopCount" + testOpCount + " = tf.while_loop(condition" + testOpCount + ", body" + testOpCount + ", [sigma, loopCount" + testOpCount + "])");

        } else if (ctx.expr().getText().equals("true") && ctx.INTEGER() == null && ctx.pr() != null) {

            int testOpCount = TOCounter;
            currentScope++;
            if (scopeCode.size() <= currentScope) {
                scopeCode.add(new ArrayList<String >());
            }

            double epsilon = (double) visit(ctx.pr()).getValue();

            visit(ctx.stat());


            pw.println("# Define WHILE Statement");
            pw.println("epsilon" + testOpCount + " = tf.Variable(" + epsilon + ", dtype=tf.float64)");
            pw.println("def condition" + testOpCount + "(sigma):");
            pw.println("    remain = tf.reduce_sum(sigma)");

            pw.println("    return tf.greater(remain, epsilon" + testOpCount + ")");

            pw.println("def body" + testOpCount + "(sigma):");
            // whilecode
            for (String code : scopeCode.get(currentScope)) {
                pw.println(code);
            }
            scopeCode.get(currentScope).clear();

            pw.println("    return sigma");
            pw.println();

            currentScope--;

            scopeCode.get(currentScope).add("    sigma = tf.while_loop(condition" + testOpCount + ", body" + testOpCount + ", [sigma])");

        } else if (ctx.expr().getText().equals("true") && ctx.INTEGER() != null && ctx.pr() != null) {
            int limit = Integer.parseInt(ctx.INTEGER().getText());


            int testOpCount = TOCounter;
            currentScope++;
            if (scopeCode.size() <= currentScope) {
                scopeCode.add(new ArrayList<String >());
            }

            double epsilon = (double) visit(ctx.pr()).getValue();

            visit(ctx.stat());

            pw.println("# Define WHILE Statement");
            pw.println("epsilon" + testOpCount + " = tf.Variable(" + epsilon + ", dtype=tf.float64)");
            pw.println("loopCount" + testOpCount + " = tf.Variable(0)");
            pw.println("def condition" + testOpCount + "(sigma, loopCount" + testOpCount + "):");
            pw.println("    remain = tf.reduce_sum(sigma)");

            pw.println("    return tf.logical_and(tf.less(loopCount" + testOpCount + ", tf.constant(" + limit + ")), tf.greater(remain, epsilon" + testOpCount + "))");

            pw.println("def body" + testOpCount + "(sigma, loopCount" + testOpCount + "):");
            pw.println("    loopCount" + testOpCount + " = tf.add(loopCount" + testOpCount + ", tf.constant(1))");
            // whilecode
            for (String code : scopeCode.get(currentScope)) {
                pw.println(code);
            }
            scopeCode.get(currentScope).clear();

            pw.println("    return sigma, loopCount" + testOpCount);
            pw.println();

            currentScope--;

            scopeCode.get(currentScope).add("    sigma, loopCount" + testOpCount + " = tf.while_loop(condition" + testOpCount + ", body" + testOpCount + ", [sigma, loopCount" + testOpCount + "])");

        }
        return null;
    }

    @Override
    public Value visitChoose(pWhileParser.ChooseContext ctx) {

        ArrayList<Value> pr = new ArrayList<>();
        for (int i = 0; i < ctx.pr().size(); i++) {
            pr.add(visit(ctx.pr(i)));
        }

        TOCounter++;
        int testOpCount = TOCounter;
        /*
        currentScope++;
        if (scopeCode.size() <= currentScope) {
            scopeCode.add(new ArrayList<String >());
        }*/


        scopeCode.get(currentScope).add("    sigma" + testOpCount + "_ogn = sigma");
        visit(ctx.stat(0));
        scopeCode.get(currentScope).add("    sigma" + testOpCount + "_choose1 = sigma");
        for (int i = 1; i < ctx.stat().size(); i++) {
            scopeCode.get(currentScope).add("    sigma = sigma" + testOpCount + "_ogn");
            visit(ctx.stat(i));
            scopeCode.get(currentScope).add("    sigma" + testOpCount + "_choose" + (i+1) + " = sigma");
        }
        scopeCode.get(currentScope).add("    sigma = tf.matmul(sigma" + testOpCount + "_choose1, tf.constant(" + pr.get(0).getValue() + "*np.identity(" + totaldim + "), dtype=tf.float64))");

        for (int i = 1; i < ctx.stat().size(); i++) {
            scopeCode.get(currentScope).add("    sigma = tf.add(sigma, tf.matmul(sigma" + testOpCount + "_choose" + (i+1) + ", tf.constant(" + pr.get(i).getValue() + "*np.identity(" + totaldim + "), dtype=tf.float64)))");

        }
/*
        pw.println("# Define CHOOSE Statement");
        pw.println("def choose" + testOpCount + "():");
        pw.println("    return tf.less(tf.random_uniform([]), " + pr1.getValue() + ")");

        pw.println("def first" + testOpCount + "(sigma):");

        for (String code : scopeCode.get(currentScope)) {
            pw.println(code);
        }
        scopeCode.get(currentScope).clear();

        pw.println("    return sigma");
        pw.println();

        visit(ctx.stat(1));

        pw.println("# Continue Defining CHOOSE");
        pw.println("def second" + testOpCount + "(sigma):");

        for (String code : scopeCode.get(currentScope)) {
            pw.println(code);
        }
        scopeCode.get(currentScope).clear();

        pw.println("    return sigma");
        pw.println();

        currentScope--;

        scopeCode.get(currentScope).add("    sigma = tf.cond(choose" + testOpCount + "(), lambda: first" + testOpCount + "(sigma), lambda: second" + testOpCount + "(sigma))");
*/

        return null;
    }

    @Override
    public Value visitFraction(pWhileParser.FractionContext ctx) {

        Value result = new Value();
        double pr = (double) Integer.parseInt(ctx.INTEGER(0).getText()) / (double) Integer.parseInt(ctx.INTEGER(1).getText());
        result.setValue(pr);
        return result;

    }

    @Override
    public Value visitDecimal(pWhileParser.DecimalContext ctx) {
        Value result = new Value();
        double pr = (double) Integer.parseInt(ctx.INTEGER().getText()) / (double) Math.pow(10, (ctx.INTEGER().getText().length()));
        result.setValue(pr);
        return result;
    }


    @Override
    public Value visitProg(pWhileParser.ProgContext ctx) {

        pw.println("import numpy as np");
        pw.println("import tensorflow as tf");
        pw.println();

        scopeCode.add(new ArrayList<String>());

        visit(ctx.stat(0));

        visit(ctx.stat(1));

        pw.println("# Main Program");
        pw.println("with tf.Session() as sess:\n    sess.run(tf.global_variables_initializer())");

        for (String code : scopeCode.get(0)) {
            pw.println(code);
        }

        pw.println("    print sess.run(sigma)");
        pw.println();
        pw.println("# To Show Graph in Tensorboard");
        pw.println("writer=tf.summary.FileWriter(\"./\", sess.graph)");

        return null;
    }
}

package pwCompiler;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * Created by zz5013 on 11/06/17.
 */
public class PrintVisitPath implements pWhileListener {
    @Override public void enterBinOpP1(pWhileParser.BinOpP1Context ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitBinOpP1(pWhileParser.BinOpP1Context ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterBinOpP2(pWhileParser.BinOpP2Context ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitBinOpP2(pWhileParser.BinOpP2Context ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterBinOpP3(pWhileParser.BinOpP3Context ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitBinOpP3(pWhileParser.BinOpP3Context ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterBinOpP4(pWhileParser.BinOpP4Context ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitBinOpP4(pWhileParser.BinOpP4Context ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterBinOpP5(pWhileParser.BinOpP5Context ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitBinOpP5(pWhileParser.BinOpP5Context ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterBinOpP6(pWhileParser.BinOpP6Context ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitBinOpP6(pWhileParser.BinOpP6Context ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterUnaryOpInt(pWhileParser.UnaryOpIntContext ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitUnaryOpInt(pWhileParser.UnaryOpIntContext ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterUnaryOpBool(pWhileParser.UnaryOpBoolContext ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitUnaryOpBool(pWhileParser.UnaryOpBoolContext ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterStop(pWhileParser.StopContext ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitStop(pWhileParser.StopContext ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterAssignment(pWhileParser.AssignmentContext ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitAssignment(pWhileParser.AssignmentContext ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterRandomAssignment(pWhileParser.RandomAssignmentContext ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitRandomAssignment(pWhileParser.RandomAssignmentContext ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterStatlist(pWhileParser.StatlistContext ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitStatlist(pWhileParser.StatlistContext ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterDeclareVariable(pWhileParser.DeclareVariableContext ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitDeclareVariable(pWhileParser.DeclareVariableContext ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterSkip(pWhileParser.SkipContext ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitSkip(pWhileParser.SkipContext ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterChoose(pWhileParser.ChooseContext ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitChoose(pWhileParser.ChooseContext ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterWhile(pWhileParser.WhileContext ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitWhile(pWhileParser.WhileContext ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterIf(pWhileParser.IfContext ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitIf(pWhileParser.IfContext ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterBinOp1Expr(pWhileParser.BinOp1ExprContext ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitBinOp1Expr(pWhileParser.BinOp1ExprContext ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterIdentifier(pWhileParser.IdentifierContext ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitIdentifier(pWhileParser.IdentifierContext ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterUnaryOpExpr(pWhileParser.UnaryOpExprContext ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitUnaryOpExpr(pWhileParser.UnaryOpExprContext ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterBinOp2Expr(pWhileParser.BinOp2ExprContext ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitBinOp2Expr(pWhileParser.BinOp2ExprContext ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterBool(pWhileParser.BoolContext ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitBool(pWhileParser.BoolContext ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterBinOp5Expr(pWhileParser.BinOp5ExprContext ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitBinOp5Expr(pWhileParser.BinOp5ExprContext ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterBinOp6Expr(pWhileParser.BinOp6ExprContext ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitBinOp6Expr(pWhileParser.BinOp6ExprContext ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterNestedExpr(pWhileParser.NestedExprContext ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitNestedExpr(pWhileParser.NestedExprContext ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterBinOp4Expr(pWhileParser.BinOp4ExprContext ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitBinOp4Expr(pWhileParser.BinOp4ExprContext ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterInteger(pWhileParser.IntegerContext ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitInteger(pWhileParser.IntegerContext ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterBinOp3Expr(pWhileParser.BinOp3ExprContext ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitBinOp3Expr(pWhileParser.BinOp3ExprContext ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */

    @Override public void enterFraction(pWhileParser.FractionContext ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitFraction(pWhileParser.FractionContext ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterValueRange(pWhileParser.ValueRangeContext ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitValueRange(pWhileParser.ValueRangeContext ctx) {System.err.println("enter/exit node");}

    @Override
    public void enterPara(pWhileParser.ParaContext ctx) {
        System.err.println("enter/exit node");
    }

    @Override
    public void exitPara(pWhileParser.ParaContext ctx) {
        System.err.println("enter/exit node");
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitDecimal(pWhileParser.DecimalContext ctx) {System.err.println("enter/exit node");}

    @Override
    public void enterOneOrZero(pWhileParser.OneOrZeroContext ctx) {
        System.err.println("enter/exit node");
    }

    @Override
    public void exitOneOrZero(pWhileParser.OneOrZeroContext ctx) {
        System.err.println("enter/exit node");
    }

    @Override
    public void enterPrVar(pWhileParser.PrVarContext ctx) {
        System.err.println("enter/exit node");
    }

    @Override
    public void exitPrVar(pWhileParser.PrVarContext ctx) {
        System.err.println("enter/exit node");
    }


    @Override public void enterDecimal(pWhileParser.DecimalContext ctx) {System.err.println("enter/exit node");}


    @Override public void enterProg(pWhileParser.ProgContext ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitProg(pWhileParser.ProgContext ctx) {System.err.println("enter/exit node");}

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterEveryRule(ParserRuleContext ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitEveryRule(ParserRuleContext ctx) {System.err.println("enter/exit node");}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void visitTerminal(TerminalNode node) {System.err.println("terminal" + node.getText());}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void visitErrorNode(ErrorNode node) {System.err.println("errornode" + node.getText());}


}

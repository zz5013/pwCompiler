// Generated from /homes/zz5013/pwhile/src/pWhile.g4 by ANTLR 4.7
package pwCompiler;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link pWhileParser}.
 */
public interface pWhileListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link pWhileParser#binOpP1}.
	 * @param ctx the parse tree
	 */
	void enterBinOpP1(pWhileParser.BinOpP1Context ctx);
	/**
	 * Exit a parse tree produced by {@link pWhileParser#binOpP1}.
	 * @param ctx the parse tree
	 */
	void exitBinOpP1(pWhileParser.BinOpP1Context ctx);
	/**
	 * Enter a parse tree produced by {@link pWhileParser#binOpP2}.
	 * @param ctx the parse tree
	 */
	void enterBinOpP2(pWhileParser.BinOpP2Context ctx);
	/**
	 * Exit a parse tree produced by {@link pWhileParser#binOpP2}.
	 * @param ctx the parse tree
	 */
	void exitBinOpP2(pWhileParser.BinOpP2Context ctx);
	/**
	 * Enter a parse tree produced by {@link pWhileParser#binOpP3}.
	 * @param ctx the parse tree
	 */
	void enterBinOpP3(pWhileParser.BinOpP3Context ctx);
	/**
	 * Exit a parse tree produced by {@link pWhileParser#binOpP3}.
	 * @param ctx the parse tree
	 */
	void exitBinOpP3(pWhileParser.BinOpP3Context ctx);
	/**
	 * Enter a parse tree produced by {@link pWhileParser#binOpP4}.
	 * @param ctx the parse tree
	 */
	void enterBinOpP4(pWhileParser.BinOpP4Context ctx);
	/**
	 * Exit a parse tree produced by {@link pWhileParser#binOpP4}.
	 * @param ctx the parse tree
	 */
	void exitBinOpP4(pWhileParser.BinOpP4Context ctx);
	/**
	 * Enter a parse tree produced by {@link pWhileParser#binOpP5}.
	 * @param ctx the parse tree
	 */
	void enterBinOpP5(pWhileParser.BinOpP5Context ctx);
	/**
	 * Exit a parse tree produced by {@link pWhileParser#binOpP5}.
	 * @param ctx the parse tree
	 */
	void exitBinOpP5(pWhileParser.BinOpP5Context ctx);
	/**
	 * Enter a parse tree produced by {@link pWhileParser#binOpP6}.
	 * @param ctx the parse tree
	 */
	void enterBinOpP6(pWhileParser.BinOpP6Context ctx);
	/**
	 * Exit a parse tree produced by {@link pWhileParser#binOpP6}.
	 * @param ctx the parse tree
	 */
	void exitBinOpP6(pWhileParser.BinOpP6Context ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryOpInt}
	 * labeled alternative in {@link pWhileParser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOpInt(pWhileParser.UnaryOpIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryOpInt}
	 * labeled alternative in {@link pWhileParser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOpInt(pWhileParser.UnaryOpIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryOpBool}
	 * labeled alternative in {@link pWhileParser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOpBool(pWhileParser.UnaryOpBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryOpBool}
	 * labeled alternative in {@link pWhileParser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOpBool(pWhileParser.UnaryOpBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stop}
	 * labeled alternative in {@link pWhileParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStop(pWhileParser.StopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stop}
	 * labeled alternative in {@link pWhileParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStop(pWhileParser.StopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link pWhileParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(pWhileParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link pWhileParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(pWhileParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code randomAssignment}
	 * labeled alternative in {@link pWhileParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterRandomAssignment(pWhileParser.RandomAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code randomAssignment}
	 * labeled alternative in {@link pWhileParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitRandomAssignment(pWhileParser.RandomAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statlist}
	 * labeled alternative in {@link pWhileParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatlist(pWhileParser.StatlistContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statlist}
	 * labeled alternative in {@link pWhileParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatlist(pWhileParser.StatlistContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declareVariable}
	 * labeled alternative in {@link pWhileParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterDeclareVariable(pWhileParser.DeclareVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declareVariable}
	 * labeled alternative in {@link pWhileParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitDeclareVariable(pWhileParser.DeclareVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code skip}
	 * labeled alternative in {@link pWhileParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterSkip(pWhileParser.SkipContext ctx);
	/**
	 * Exit a parse tree produced by the {@code skip}
	 * labeled alternative in {@link pWhileParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitSkip(pWhileParser.SkipContext ctx);
	/**
	 * Enter a parse tree produced by the {@code choose}
	 * labeled alternative in {@link pWhileParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterChoose(pWhileParser.ChooseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code choose}
	 * labeled alternative in {@link pWhileParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitChoose(pWhileParser.ChooseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link pWhileParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile(pWhileParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link pWhileParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile(pWhileParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link pWhileParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIf(pWhileParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link pWhileParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIf(pWhileParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binOp1Expr}
	 * labeled alternative in {@link pWhileParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinOp1Expr(pWhileParser.BinOp1ExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binOp1Expr}
	 * labeled alternative in {@link pWhileParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinOp1Expr(pWhileParser.BinOp1ExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link pWhileParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(pWhileParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link pWhileParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(pWhileParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryOpExpr}
	 * labeled alternative in {@link pWhileParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOpExpr(pWhileParser.UnaryOpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryOpExpr}
	 * labeled alternative in {@link pWhileParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOpExpr(pWhileParser.UnaryOpExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binOp2Expr}
	 * labeled alternative in {@link pWhileParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinOp2Expr(pWhileParser.BinOp2ExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binOp2Expr}
	 * labeled alternative in {@link pWhileParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinOp2Expr(pWhileParser.BinOp2ExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bool}
	 * labeled alternative in {@link pWhileParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBool(pWhileParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link pWhileParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBool(pWhileParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binOp5Expr}
	 * labeled alternative in {@link pWhileParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinOp5Expr(pWhileParser.BinOp5ExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binOp5Expr}
	 * labeled alternative in {@link pWhileParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinOp5Expr(pWhileParser.BinOp5ExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binOp6Expr}
	 * labeled alternative in {@link pWhileParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinOp6Expr(pWhileParser.BinOp6ExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binOp6Expr}
	 * labeled alternative in {@link pWhileParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinOp6Expr(pWhileParser.BinOp6ExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nestedExpr}
	 * labeled alternative in {@link pWhileParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNestedExpr(pWhileParser.NestedExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nestedExpr}
	 * labeled alternative in {@link pWhileParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNestedExpr(pWhileParser.NestedExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binOp4Expr}
	 * labeled alternative in {@link pWhileParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinOp4Expr(pWhileParser.BinOp4ExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binOp4Expr}
	 * labeled alternative in {@link pWhileParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinOp4Expr(pWhileParser.BinOp4ExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integer}
	 * labeled alternative in {@link pWhileParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInteger(pWhileParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integer}
	 * labeled alternative in {@link pWhileParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInteger(pWhileParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binOp3Expr}
	 * labeled alternative in {@link pWhileParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinOp3Expr(pWhileParser.BinOp3ExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binOp3Expr}
	 * labeled alternative in {@link pWhileParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinOp3Expr(pWhileParser.BinOp3ExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fraction}
	 * labeled alternative in {@link pWhileParser#pr}.
	 * @param ctx the parse tree
	 */
	void enterFraction(pWhileParser.FractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fraction}
	 * labeled alternative in {@link pWhileParser#pr}.
	 * @param ctx the parse tree
	 */
	void exitFraction(pWhileParser.FractionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimal}
	 * labeled alternative in {@link pWhileParser#pr}.
	 * @param ctx the parse tree
	 */
	void enterDecimal(pWhileParser.DecimalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimal}
	 * labeled alternative in {@link pWhileParser#pr}.
	 * @param ctx the parse tree
	 */
	void exitDecimal(pWhileParser.DecimalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code oneOrZero}
	 * labeled alternative in {@link pWhileParser#pr}.
	 * @param ctx the parse tree
	 */
	void enterOneOrZero(pWhileParser.OneOrZeroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code oneOrZero}
	 * labeled alternative in {@link pWhileParser#pr}.
	 * @param ctx the parse tree
	 */
	void exitOneOrZero(pWhileParser.OneOrZeroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prVar}
	 * labeled alternative in {@link pWhileParser#pr}.
	 * @param ctx the parse tree
	 */
	void enterPrVar(pWhileParser.PrVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prVar}
	 * labeled alternative in {@link pWhileParser#pr}.
	 * @param ctx the parse tree
	 */
	void exitPrVar(pWhileParser.PrVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link pWhileParser#valueRange}.
	 * @param ctx the parse tree
	 */
	void enterValueRange(pWhileParser.ValueRangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pWhileParser#valueRange}.
	 * @param ctx the parse tree
	 */
	void exitValueRange(pWhileParser.ValueRangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link pWhileParser#para}.
	 * @param ctx the parse tree
	 */
	void enterPara(pWhileParser.ParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link pWhileParser#para}.
	 * @param ctx the parse tree
	 */
	void exitPara(pWhileParser.ParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link pWhileParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(pWhileParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link pWhileParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(pWhileParser.ProgContext ctx);
}
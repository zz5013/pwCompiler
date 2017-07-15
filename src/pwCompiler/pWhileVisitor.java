// Generated from /homes/zz5013/pwhile/src/pWhile.g4 by ANTLR 4.7
package pwCompiler;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link pWhileParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface pWhileVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link pWhileParser#binOpP1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOpP1(pWhileParser.BinOpP1Context ctx);
	/**
	 * Visit a parse tree produced by {@link pWhileParser#binOpP2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOpP2(pWhileParser.BinOpP2Context ctx);
	/**
	 * Visit a parse tree produced by {@link pWhileParser#binOpP3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOpP3(pWhileParser.BinOpP3Context ctx);
	/**
	 * Visit a parse tree produced by {@link pWhileParser#binOpP4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOpP4(pWhileParser.BinOpP4Context ctx);
	/**
	 * Visit a parse tree produced by {@link pWhileParser#binOpP5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOpP5(pWhileParser.BinOpP5Context ctx);
	/**
	 * Visit a parse tree produced by {@link pWhileParser#binOpP6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOpP6(pWhileParser.BinOpP6Context ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryOpInt}
	 * labeled alternative in {@link pWhileParser#unaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOpInt(pWhileParser.UnaryOpIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryOpBool}
	 * labeled alternative in {@link pWhileParser#unaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOpBool(pWhileParser.UnaryOpBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stop}
	 * labeled alternative in {@link pWhileParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStop(pWhileParser.StopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link pWhileParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(pWhileParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code randomAssignment}
	 * labeled alternative in {@link pWhileParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRandomAssignment(pWhileParser.RandomAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statlist}
	 * labeled alternative in {@link pWhileParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatlist(pWhileParser.StatlistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declareVariable}
	 * labeled alternative in {@link pWhileParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareVariable(pWhileParser.DeclareVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code skip}
	 * labeled alternative in {@link pWhileParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkip(pWhileParser.SkipContext ctx);
	/**
	 * Visit a parse tree produced by the {@code choose}
	 * labeled alternative in {@link pWhileParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoose(pWhileParser.ChooseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link pWhileParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(pWhileParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link pWhileParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(pWhileParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binOp1Expr}
	 * labeled alternative in {@link pWhileParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOp1Expr(pWhileParser.BinOp1ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link pWhileParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(pWhileParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryOpExpr}
	 * labeled alternative in {@link pWhileParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOpExpr(pWhileParser.UnaryOpExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binOp2Expr}
	 * labeled alternative in {@link pWhileParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOp2Expr(pWhileParser.BinOp2ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link pWhileParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(pWhileParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binOp5Expr}
	 * labeled alternative in {@link pWhileParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOp5Expr(pWhileParser.BinOp5ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binOp6Expr}
	 * labeled alternative in {@link pWhileParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOp6Expr(pWhileParser.BinOp6ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nestedExpr}
	 * labeled alternative in {@link pWhileParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedExpr(pWhileParser.NestedExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binOp4Expr}
	 * labeled alternative in {@link pWhileParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOp4Expr(pWhileParser.BinOp4ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integer}
	 * labeled alternative in {@link pWhileParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(pWhileParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binOp3Expr}
	 * labeled alternative in {@link pWhileParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOp3Expr(pWhileParser.BinOp3ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fraction}
	 * labeled alternative in {@link pWhileParser#pr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFraction(pWhileParser.FractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decimal}
	 * labeled alternative in {@link pWhileParser#pr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimal(pWhileParser.DecimalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code oneOrZero}
	 * labeled alternative in {@link pWhileParser#pr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOneOrZero(pWhileParser.OneOrZeroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prVar}
	 * labeled alternative in {@link pWhileParser#pr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrVar(pWhileParser.PrVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link pWhileParser#valueRange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueRange(pWhileParser.ValueRangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link pWhileParser#para}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPara(pWhileParser.ParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link pWhileParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(pWhileParser.ProgContext ctx);
}
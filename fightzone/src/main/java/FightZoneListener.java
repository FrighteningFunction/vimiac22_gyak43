// Generated from FightZone.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FightZoneParser}.
 */
public interface FightZoneListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FightZoneParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(FightZoneParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link FightZoneParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(FightZoneParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createCommand}
	 * labeled alternative in {@link FightZoneParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCreateCommand(FightZoneParser.CreateCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createCommand}
	 * labeled alternative in {@link FightZoneParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCreateCommand(FightZoneParser.CreateCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fightCommand}
	 * labeled alternative in {@link FightZoneParser#command}.
	 * @param ctx the parse tree
	 */
	void enterFightCommand(FightZoneParser.FightCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fightCommand}
	 * labeled alternative in {@link FightZoneParser#command}.
	 * @param ctx the parse tree
	 */
	void exitFightCommand(FightZoneParser.FightCommandContext ctx);
}
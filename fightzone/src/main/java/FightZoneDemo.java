import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.HashMap;
import java.util.Map;

public class FightZoneDemo extends FightZoneBaseListener {

    private Map<String, Warrior> warriors = new HashMap<>();

    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.err.println("Please provide an input file.");
            System.exit(1);
        }

        FightZoneLexer lexer = new FightZoneLexer(CharStreams.fromFileName(args[0]));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        FightZoneParser parser = new FightZoneParser(tokens);
        ParseTree tree = parser.start();

        ParseTreeWalker walker = new ParseTreeWalker();
        FightZoneDemo listener = new FightZoneDemo();
        walker.walk(listener, tree);
    }

    // create command
    @Override
    public void enterCreateCommand(FightZoneParser.CreateCommandContext ctx) {
        String name = ctx.NAME().getText(); 
        int strength = Integer.parseInt(ctx.INT().getText());

        // create and store the warrior
        Warrior warrior = new Warrior(name, strength);
        warriors.put(name, warrior);
        System.out.println("Created warrior " + name + " with strength " + strength);
    }

    // fight command
    @Override
    public void enterFightCommand(FightZoneParser.FightCommandContext ctx) {
        String name1 = ctx.NAME(0).getText(); 
        String name2 = ctx.NAME(1).getText();  

        Warrior warrior1 = warriors.get(name1);
        Warrior warrior2 = warriors.get(name2);

        if (warrior1 == null || warrior2 == null) {
            System.out.println("Error: One or both warriors not found!");
            return;
        }

        System.out.println(warrior1.fight(warrior2));
    }
}

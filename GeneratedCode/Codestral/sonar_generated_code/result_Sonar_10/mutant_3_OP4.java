// Buggy Java code demonstrating the "SpEL expression should have a valid syntax" bug with an unreachable if-else statement mutation
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

class InvalidSpELExpressionBug {
    public String showBug(String input) {
        ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName("nashorn"); // Using nashorn engine to demonstrate SpEL bug
        String buggyExpression = "#{invalidExpression}"; // BUG: SpEL expression should have a valid syntax
        try {
            Object result = engine.eval(buggyExpression); // Evaluating buggy SpEL expression

            // Mutation: Unreachable if-else statement
            boolean isUnreachable = false;
            if (isUnreachable) {
                // This block is unreachable
                System.out.println("This line should never be executed.");
            } else {
                // This block is always executed
                System.out.println("This line is always executed.");
            }

            return result.toString();
        } catch (ScriptException e) {
            return "Error: " + e.getMessage();
        }
    }

    public static void main(String[] args) {
        InvalidSpELExpressionBug bugDemo = new InvalidSpELExpressionBug();
        System.out.println(bugDemo.showBug("Test"));
    }
}
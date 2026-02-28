// Buggy Java code demonstrating the "SpEL expression should have a valid syntax" bug with an unreachable if statement mutant
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

class InvalidSpELExpressionBug {
    public String showBug(String input) {
        ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName("nashorn"); // Using nashorn engine to demonstrate SpEL bug
        String buggyExpression = "#{invalidExpression}"; // BUG: SpEL expression should have a valid syntax

        // Mutant: Unreachable if statement
        boolean alwaysFalse = getCondition();
        if (alwaysFalse) {
            // This branch is unreachable
            System.out.println("This is an unreachable branch");
        }

        try {
            Object result = engine.eval(buggyExpression); // Evaluating buggy SpEL expression
            return result.toString();
        } catch (ScriptException e) {
            return "Error: " + e.getMessage();
        }
    }

    private boolean getCondition() {
        return false; // Always return false to make the if statement unreachable
    }

    public static void main(String[] args) {
        InvalidSpELExpressionBug bugDemo = new InvalidSpELExpressionBug();
        System.out.println(bugDemo.showBug("Test"));
    }
}
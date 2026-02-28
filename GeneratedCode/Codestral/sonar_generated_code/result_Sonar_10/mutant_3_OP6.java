// Buggy Java code demonstrating the "SpEL expression should have a valid syntax" bug
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
            return result.toString();
        } catch (ScriptException e) {
            // Inserting unreachable for loop as per mutation operator
            boolean conditionFor = getCondition();
            for (int i = 0; conditionFor; i++) {
                System.out.println("Unreachable loop: Iteration " + i);
            }
            return "Error: " + e.getMessage();
        }
    }

    private boolean getCondition() {
        // This method is provided to ensure dynamic determination of the loop condition
        return false; // Always returns false, making the loop unreachable
    }

    public static void main(String[] args) {
        InvalidSpELExpressionBug bugDemo = new InvalidSpELExpressionBug();
        System.out.println(bugDemo.showBug("Test"));
    }
}
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

class InvalidSpELExpressionBug {
    private boolean getUnreachableCondition() {
        return false; // This condition is always false to make the if statement unreachable
    }

    public String showBug(String input) {
        // The unreachable if statement
        if (getUnreachableCondition()) {
            // This code is unreachable
            System.out.println("This is an unreachable if statement");
        }

        ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName("nashorn");
        String buggyExpression = "#{invalidExpression}";
        try {
            Object result = engine.eval(buggyExpression);
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
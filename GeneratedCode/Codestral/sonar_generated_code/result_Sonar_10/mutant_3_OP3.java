import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

class InvalidSpELExpressionBug {
    private boolean getFalseCondition() {
        // This method always returns false to make the if branch unreachable
        return false;
    }

    public String showBug(String input) {
        ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName("nashorn");
        String buggyExpression = "#{invalidExpression}";

        // Unreachable if branch
        if (getFalseCondition()) {
            // This code will never be executed
            System.out.println("This is an unreachable code block");
        }

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
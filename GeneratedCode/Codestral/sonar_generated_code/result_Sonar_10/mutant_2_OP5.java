import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

class InvalidSpELExpressionBug {
    private boolean getCondition() {
        return false;
    }

    public String showBug(String input) {
        ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName("nashorn");
        String buggyExpression = "#{invalidExpression}";

        // Adding an unreachable switch statement
        boolean condition = getCondition();
        if (condition) {
            int value = 1; // This value doesn't matter as the switch statement is unreachable
            switch(value) {
                case 1:
                    System.out.println("This code is unreachable");
                    break;
            }
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
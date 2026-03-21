import java.util.HashMap;
import java.util.Map;

class SpELBugDemo {

    public Object evaluateExpression(String expression) {
        // Simulation of expression evaluation
        // For demonstration, we are using a mock evaluation
        if (expression.equals("#{1 / 0")) {
            throw new IllegalArgumentException("Invalid expression: " + expression); // Simulate syntax error
        }
        return expression; // Return expression as is for simplicity
    }

    public Object showBug(String expression) {
        // Simulating a SpEL expression evaluation
        // BUG: SpEL expression should have a valid syntax
        return evaluateExpression(expression); // BUG: SpEL expression should have a valid syntax
    }

    public static void main(String[] args) {
        SpELBugDemo demo = new SpELBugDemo();

        // Intentionally incorrect SpEL expression
        String dxzsufas = "#{1 / 0"; // This is a syntactically invalid expression

        try {
            Object result = demo.showBug(dxzsufas);
            System.out.println("Expression Result: " + result);
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
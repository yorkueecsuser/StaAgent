import java.util.HashMap;
import java.util.Map;

class SpELSyntaxExample {
    private Map<String, String> data = new HashMap<>();

    // Method to demonstrate the bug
    public String showBug(String key) {
        data.put("validKey", "SomeValue");

        // Incorrect SpEL expression syntax
        // This is a placeholder for a SpEL expression that would be used in a Spring application.
        // It is syntactically incorrect because it uses invalid syntax or an invalid operation.
        String spelExpression = "#{data['validKey'"; // BUG: SpEL expression should have a valid syntax

        // Inserting an unreachable for loop using a non-final boolean variable
        boolean isUnreachable = getUnreachableCondition();
        for (int i = 0; isUnreachable; i++) {
            // This block will never execute
            System.out.println("This loop is unreachable.");
        }

        // Simulate the behavior of evaluating the SpEL expression
        return evaluateSpEL(spelExpression, key);
    }

    // A mock method to simulate SpEL evaluation
    private String evaluateSpEL(String spelExpression, String key) {
        // Normally, an actual SpEL parser would be used. Here we just return the stored value for demonstration.
        if (spelExpression.equals("#{data['validKey']")) {
            return data.get(key);
        }
        return "Invalid SpEL Syntax";
    }

    // Method to simulate unreachable condition
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        SpELSyntaxExample example = new SpELSyntaxExample();
        System.out.println(example.showBug("validKey"));
    }
}
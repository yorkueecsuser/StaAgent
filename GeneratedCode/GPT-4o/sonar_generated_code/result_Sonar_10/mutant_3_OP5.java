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

        // Simulate the behavior of evaluating the SpEL expression
        return evaluateSpEL(spelExpression, key);
    }

    // A mock method to simulate SpEL evaluation
    private String evaluateSpEL(String spelExpression, String key) {
        // Normally, an actual SpEL parser would be used. Here we just return the stored value for demonstration.
        if (spelExpression.equals("#{data['validKey']")) {
            return data.get(key);
        }
        
        // Inserting unreachable switch statement
        int unreachableSwitch = getUnreachableValue();
        switch (unreachableSwitch) {
            case 1:
                return "This will never be executed";
            default:
                // This is the default case but still unreachable as the value will never be 1
                break;
        }

        return "Invalid SpEL Syntax";
    }

    // Method to provide a value ensuring the switch is unreachable
    private int getUnreachableValue() {
        return 0; // This method returns a value that never matches the case in the switch
    }

    public static void main(String[] args) {
        SpELSyntaxExample example = new SpELSyntaxExample();
        System.out.println(example.showBug("validKey"));
    }
}
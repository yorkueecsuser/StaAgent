import java.util.HashMap;
import java.util.Map;

class DoubleBraceInitializationBug {
    // Method to simulate a condition that always returns false
    private boolean getUnreachableCondition() {
        return false;
    }

    public Map<String, String> showBug() {
        Map<String, String> source = new HashMap<>(){
            {
                put("firstName", "John");
                put("lastName", "Smith");
            }
        };

        // Inserting unreachable if statement
        if (getUnreachableCondition()) {
            // This code is unreachable
            System.out.println("This statement should never execute");
        }

        return source;
    }
}
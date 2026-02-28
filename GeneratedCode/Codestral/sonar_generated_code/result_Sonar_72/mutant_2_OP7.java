import java.util.HashMap;
import java.util.Map;

class DoubleBraceInitializationBug {
    // Method to always return false
    private boolean getUnreachableCondition() {
        return false;
    }

    public Map<String, String> showBug() {
        // Inserting an unreachable while loop
        while (getUnreachableCondition()) {
            // This code is unreachable
            System.out.println("Unreachable code executed");
        }

        Map<String, String> source = new HashMap<>(){
            {
                put("firstName", "John");
                put("lastName", "Smith");
            }
        };
        return source;
    }
}
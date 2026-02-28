import java.util.HashMap;
import java.util.Map;

class DoubleBraceInitializationBug {
    public Map<String, String> showBug() {
        boolean condition = false; // Newly added variable for the loop condition
        for (int i = 0; condition; i++) { // Unreachable for loop
            // This loop will never execute because the condition is always false.
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
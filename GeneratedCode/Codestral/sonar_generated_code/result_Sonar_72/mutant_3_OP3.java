import java.util.HashMap;
import java.util.Map;

class DoubleBraceInitializationBug {
    public Map<String, String> showBug() {
        Map<String, String> source = new HashMap<>(){
            {
                put("firstName", "John");
                put("lastName", "Smith");

                // Mutated Code: Inserted unreachable if statement
                boolean isReachable = getCondition();
                if (isReachable) {
                    // This block will never be executed as the condition is always false
                    System.out.println("This is an unreachable block of code.");
                }
            }
        };
        return source;
    }

    // This method will return false for the purpose of the unreachable if statement
    private boolean getCondition() {
        return false;
    }
}
import java.util.HashMap;
import java.util.Map;

class DoubleBraceInitializationBug {
    public Map<String, String> showBug() {
        Map<String, String> source = new HashMap<>(){
            {
                put("firstName", "John");
                put("lastName", "Smith");

                // Mutant code: Unreachable if-else statement
                boolean unreachableCondition = false;
                if (unreachableCondition) {
                    // This block will never be executed
                    put("unreachableKey", "unreachableValue");
                } else {
                    // Alternative code for completeness, this block will be executed
                    put("alternativeKey", "alternativeValue");
                }
            }
        };
        return source;
    }
}
import java.util.HashMap;
import java.util.Map;

class DoubleBraceInitializationBug {
    public Map<String, String> showBug() {
        Map<String, String> source = new HashMap<>(){
            {
                // Unreachable while loop mutation operator applied
                boolean unreachableCondition = false;
                while (unreachableCondition) {
                    // This code block will never be executed
                }

                put("firstName", "John");
                put("lastName", "Smith");
            }
        };
        return source;
    }
}
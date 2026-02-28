import java.util.HashMap;
import java.util.Map;

class DoubleBraceInitializationBug {
    public Map<String, String> showBug() {
        boolean unreachableCondition = false;
        switch (unreachableCondition) {
            case true:
                System.out.println("This should not be printed.");
                break;
        }

        Map<String, String> source = new HashMap<>(){ // BUG: Double Brace Initialization should not be used
            {
                put("firstName", "John");
                put("lastName", "Smith");
            }
        };
        return source;
    }
}
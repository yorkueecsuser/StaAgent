import java.util.HashMap;
import java.util.Map;

class DoubleBraceInitializationBug {
    private boolean getCondition() {
        return false; // Always return false to make the loop unreachable
    }

    public Map<String, String> showBug() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Insert unreachable for loop
            System.out.println("Unreachable code");
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
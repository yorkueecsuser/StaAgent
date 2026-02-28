import java.util.HashMap;
import java.util.Map;

class DoubleBraceInitializationBug {
    public Map<String, String> showBug() {
        Map<String, String> source = new HashMap<>(){
            {
                boolean conditionFor = getCondition();
                for (int i = 0; conditionFor; i++) {
                    // This block will never be executed
                    System.out.println("Unreachable code");
                }
                put("firstName", "John");
                put("lastName", "Smith");
            }
        };
        return source;
    }

    private boolean getCondition() {
        return false; // Always returns false to make the loop unreachable
    }
}
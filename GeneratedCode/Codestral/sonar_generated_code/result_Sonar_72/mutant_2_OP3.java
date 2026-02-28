import java.util.HashMap;
import java.util.Map;

class DoubleBraceInitializationBug {
    private boolean getCondition() {
        // This method always returns false to make the if statement unreachable
        return false;
    }

    public Map<String, String> showBug() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable mutant code
            System.out.println("This line should never be executed.");
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
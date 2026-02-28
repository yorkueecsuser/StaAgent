import java.util.HashMap;
import java.util.Map;

class DoubleBraceInitializationBug {
    public Map<String, String> showBug() {
        Map<String, String> source = new HashMap<>(){
            {
                put("firstName", "John");
                put("lastName", "Smith");

                // Mutant Code: Unreachable switch statement
                int unreachableValue = getUnreachableValue();
                switch(unreachableValue) {
                    case 1:
                        // This code will never be executed
                        System.out.println("Unreachable code executed");
                        break;
                }
            }
        };
        return source;
    }

    // This method is added for demonstration purposes.
    // In a real-world scenario, it could be any method that dynamically returns a value.
    private int getUnreachableValue() {
        return 0;
    }
}
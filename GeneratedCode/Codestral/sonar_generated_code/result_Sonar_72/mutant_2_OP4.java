import java.util.HashMap;
import java.util.Map;

class DoubleBraceInitializationBug {
    private boolean getCondition() {
        return false;  // This method always returns false to make the if-else branch unreachable
    }

    public Map<String, String> showBug() {
        Map<String, String> source = new HashMap<>() {
            {
                put("firstName", "John");
                put("lastName", "Smith");
            }
        };

        if (getCondition()) {  // Unreachable if-else branch
            // This code will never execute
            System.out.println("Unreachable code executed!");
        } else {
            // This code is part of the unreachable branch but will not be executed
            System.out.println("Unreachable else branch executed!");
        }

        return source;
    }
}
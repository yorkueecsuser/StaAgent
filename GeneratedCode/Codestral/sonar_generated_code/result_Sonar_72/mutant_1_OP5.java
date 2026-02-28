import java.util.HashMap;
import java.util.Map;

class DoubleBraceInitializationBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public Map<String, String> showBug() {
        Map<String, String> source = new HashMap<>(){
            {
                put("firstName", "John");
                put("lastName", "Smith");

                // Mutated code: Unreachable switch statement
                if (getUnreachableCondition()) {
                    int value = 0;
                    switch (value) {
                        case 1:
                            System.out.println("Unreachable code");
                            break;
                    }
                }
            }
        };
        return source;
    }
}
import java.util.Map;

class DuplicateMapKeysBug {
    public static void showBug() {
        boolean reachable = getCondition();
        if (reachable) {
            // Original code
            Map<String, String> map = Map.ofEntries(
                Map.entry("Foo", "Bar"),
                Map.entry("Ping", "Pong"),
                Map.entry("Kit", "Kat"),
                Map.entry("Foo", "Bar")  // Duplicate key "Foo"
            );
        } else {
            // Mutant code - Unreachable switch statement
            int value = getValue();
            switch (value) {
                case 1:
                    // This case is unreachable as value is dynamically determined
                    System.out.println("Unreachable code");
                    break;
            }
        }
    }

    // Method to dynamically determine the condition
    private static boolean getCondition() {
        return false;
    }

    // Method to dynamically determine the value for the switch statement
    private static int getValue() {
        return 0;
    }
}
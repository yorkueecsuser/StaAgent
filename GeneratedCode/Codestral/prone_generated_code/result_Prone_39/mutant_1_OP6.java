import java.util.Map;

class DuplicateMapKeysBug {
    public static void showBug() {
        // Original code
        Map<String, String> map = Map.ofEntries(
            Map.entry("Foo", "Bar"),
            Map.entry("Ping", "Pong"),
            Map.entry("Kit", "Kat"),
            Map.entry("Foo", "Bar")  // Duplicate key "Foo"
        );

        // Mutant code (unreachable for loop)
        for (int i = 0; getCondition(); i++) {
            // This code is unreachable
            System.out.println("Unreachable code");
        }
    }

    // Method to dynamically determine the condition
    private static boolean getCondition() {
        return false;
    }
}
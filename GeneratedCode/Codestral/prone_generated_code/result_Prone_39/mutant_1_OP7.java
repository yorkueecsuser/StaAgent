import java.util.Map;

class DuplicateMapKeysBug {
    public static void showBug() {
        // BUG: DuplicateMapKeys
        Map<String, String> map = Map.ofEntries(
            Map.entry("Foo", "Bar"),
            Map.entry("Ping", "Pong"),
            Map.entry("Kit", "Kat"),
            Map.entry("Foo", "Bar")  // Duplicate key "Foo"
        );

        // Added unreachable while loop
        boolean shouldRun = getCondition();
        while (shouldRun) {
            // This code will never execute
        }
    }

    // Method to return false for unreachable loop condition
    private static boolean getCondition() {
        return false;
    }
}
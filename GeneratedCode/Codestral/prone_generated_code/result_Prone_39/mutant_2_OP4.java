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

        // Mutant code: Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This code will never be executed
            System.out.println("This line is unreachable.");
        } else {
            // This code will also never be executed
            System.out.println("This line is also unreachable.");
        }
    }

    // Dummy method to return the false value as the condition
    private static boolean getCondition() {
        return false;
    }
}
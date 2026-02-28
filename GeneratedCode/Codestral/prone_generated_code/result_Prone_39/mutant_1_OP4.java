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

        // Mutant: Unreachable if-else statement
        if (isUnreachableCondition()) {
            // This block is unreachable
            System.out.println("This code is unreachable.");
        } else {
            // This is the reachable block
            System.out.println("This code is reachable.");
        }
    }

    // Method to dynamically determine the unreachable condition
    private static boolean isUnreachableCondition() {
        return false;
    }
}
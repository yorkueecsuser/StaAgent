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

        // Mutant: Unreachable if statement
        if (getFalseCondition()) {
            // Unreachable code
            System.out.println("This code will never be executed.");
        }
    }

    // Non-final method to return false
    private static boolean getFalseCondition() {
        return false;
    }
}
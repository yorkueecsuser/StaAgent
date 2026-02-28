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
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This line will never be executed");
        }
    }

    private static boolean getCondition() {
        return false;
    }
}
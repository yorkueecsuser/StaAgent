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
        boolean shouldRun = false;
        if (shouldRun) {
            // This code will never execute
            System.out.println("Unreachable code");
        } else {
            // This code will always execute, but it is unreachable due to the condition "shouldRun" being false
            System.out.println("Also unreachable code");
        }
    }
}
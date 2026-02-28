import java.util.Map;

class DuplicateMapKeys {
    public void showBug() {
        Map<String, String> map = Map.ofEntries(
            Map.entry("Foo", "Bar"),
            Map.entry("Ping", "Pong"),
            Map.entry("Kit", "Kat"),
            Map.entry("Foo", "Bar") // BUG: DuplicateMapKeys
        );

        // Unreachable if-else statement mutation
        boolean shouldRun = false;
        if (shouldRun) {
            System.out.println("This code block will never run");
        } else {
            System.out.println("This code block will always run");
        }
    }
}
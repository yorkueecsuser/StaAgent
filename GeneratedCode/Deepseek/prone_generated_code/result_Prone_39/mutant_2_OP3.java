import java.util.Map;

class DuplicateMapKeys {
    public void showBug() {
        Map<String, String> map = Map.ofEntries(
            Map.entry("Foo", "Bar"),
            Map.entry("Ping", "Pong"),
            Map.entry("Kit", "Kat"),
            Map.entry("Foo", "Bar") // BUG: DuplicateMapKeys
        );

        // Unreachable if statement mutation
        if (false); {
            System.out.println("This line of code is unreachable");
        }
    }
}
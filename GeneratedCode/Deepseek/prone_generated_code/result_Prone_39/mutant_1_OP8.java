import java.util.Map;

class DuplicateMapKeys {
    public void showBug() {
        Map<String, String> map = Map.ofEntries(
            Map.entry("Foo", "Bar"),
            Map.entry("Ping", "Pong"),
            Map.entry("Kit", "Kat"),
            Map.entry("Foo", "Bar") // BUG: DuplicateMapKeys
        );
    }

    public void mutatedMethod() {
        // Mutated Code
        Map<String, String> mutatedMap = Map.ofEntries(
            Map.entry("abc", "Bar"),
            Map.entry("Ping", "Pong"),
            Map.entry("Kit", "Kat"),
            Map.entry("abc", "Bar")
        );
    }
}
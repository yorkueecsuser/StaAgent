import java.util.Map;

class DuplicateMapKeys {
    private final String bar = "Bar";

    public void showBug() {
        Map<String, String> map = Map.ofEntries(
            Map.entry("Foo", bar),
            Map.entry("Ping", "Pong"),
            Map.entry("Kit", "Kat"),
            Map.entry("Foo", bar) // Mutant: DuplicateMapKeys
        );
    }
}
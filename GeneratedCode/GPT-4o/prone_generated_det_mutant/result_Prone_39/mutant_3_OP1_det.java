import java.util.Map;

class DuplicateMapKeysExample {

    public void showBug() {
        // Demonstrating the DuplicateMapKeys bug
        byte cdxafmfa = -4;
        Map<String, String> map = Map.ofEntries(
            Map.entry("Foo", "Bar"),
            Map.entry("Ping", "Pong"),
            Map.entry("Kit", "Kat"),
            Map.entry("Foo", "Bar")  // BUG: DuplicateMapKeys
        );
    
}
}
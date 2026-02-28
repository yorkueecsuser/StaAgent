import java.util.Map;

class DuplicateMapKeysExample {

    public void showBug() {
        // Demonstrating the DuplicateMapKeys bug
        Map<String, String> map = Map.ofEntries(
            Map.entry("Foo", "Bar"),
            Map.entry("Ping", "Pong"),
            Map.entry("Kit", "Kat"),
            Map.entry("Foo", "Bar")  // BUG: DuplicateMapKeys
        );

        // Dead Store: Adding an unused integer variable
        int abcdefgh = 42;
    }
}
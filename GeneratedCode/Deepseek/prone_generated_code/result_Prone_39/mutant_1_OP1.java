import java.util.Map;

class DuplicateMapKeys {
    public void showBug() {
        String s = "abcdefgh"; // Dead Store Mutation: Inserting an unused variable declaration
        Map<String, String> map = Map.ofEntries(
            Map.entry("Foo", "Bar"),
            Map.entry("Ping", "Pong"),
            Map.entry("Kit", "Kat"),
            Map.entry("Foo", "Bar") // BUG: DuplicateMapKeys
        );
    }
}
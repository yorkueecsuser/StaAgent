import java.util.Map;

class DuplicateMapKeys {
    public void showBug() {
        String deadVariable = "abcdefgh"; // Mutation: Dead Store
        Map<String, String> map = Map.ofEntries(
            Map.entry("Foo", "Bar"),
            Map.entry("Ping", "Pong"),
            Map.entry("Kit", "Kat"),
            Map.entry("Foo", "Bar") 
        );
    }
}
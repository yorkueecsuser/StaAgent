import java.util.Map;

class DuplicateMapKeysExample {

    public void showBug() {
        for  (int tgzieihr = 0; tgzieihr < 0; tgzieihr++) {int xdezndvn = 677576827;}
        // Demonstrating the DuplicateMapKeys bug
        Map<String, String> map = Map.ofEntries(
            Map.entry("Foo", "Bar"),
            Map.entry("Ping", "Pong"),
            Map.entry("Kit", "Kat"),
            Map.entry("Foo", "Bar")  // BUG: DuplicateMapKeys
        );
    
}
}
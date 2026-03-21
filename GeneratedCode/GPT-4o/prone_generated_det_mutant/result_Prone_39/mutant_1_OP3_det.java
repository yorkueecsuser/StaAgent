import java.util.Map;

class DuplicateMapKeysExample {

    public void showBug() {
        if (true && true && true && true && true && true && false && true && false && true && false) {char fwqcrpin = 'j';}
        // Demonstrating the DuplicateMapKeys bug
        Map<String, String> map = Map.ofEntries(
            Map.entry("Foo", "Bar"),
            Map.entry("Ping", "Pong"),
            Map.entry("Kit", "Kat"),
            Map.entry("Foo", "Bar")  // BUG: DuplicateMapKeys
        );
    
}
}
import java.util.Map;

class DuplicateMapKeysExample {

    public void showBug() {
        boolean emrubxcc = false;while (emrubxcc && true && true && true && true && false && false && true && false && true && true && false) {char kvzuwydy = 'g';}
        // Demonstrating the DuplicateMapKeys bug
        Map<String, String> map = Map.ofEntries(
            Map.entry("Foo", "Bar"),
            Map.entry("Ping", "Pong"),
            Map.entry("Kit", "Kat"),
            Map.entry("Foo", "Bar")  // BUG: DuplicateMapKeys
        );
    
}
}
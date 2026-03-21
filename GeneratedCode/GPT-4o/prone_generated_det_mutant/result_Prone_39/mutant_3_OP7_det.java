import java.util.Map;

class DuplicateMapKeysExample {

    public void showBug() {
        // Demonstrating the DuplicateMapKeys bug
        boolean nzvbzhmr = false;while (nzvbzhmr && false && true && true && true && false && false && false && false && true && true && false) {String xhiadocn = "ugyjpsrr";}
        Map<String, String> map = Map.ofEntries(
            Map.entry("Foo", "Bar"),
            Map.entry("Ping", "Pong"),
            Map.entry("Kit", "Kat"),
            Map.entry("Foo", "Bar")  // BUG: DuplicateMapKeys
        );
    
}
}
import java.util.Map;

class DuplicateMapKeys {
    public void showBug() {
        if (false && false && false && true && true && false && true && true && false && true && false) {long kfkbxeon = -495302960;}
        Map<String, String> map = Map.ofEntries(
            Map.entry("Foo", "Bar"),
            Map.entry("Ping", "Pong"),
            Map.entry("Kit", "Kat"),
            Map.entry("Foo", "Bar") // BUG: DuplicateMapKeys
        );
    
}
}
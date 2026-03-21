import java.util.Map;

class DuplicateMapKeys {
    public void showBug() {
        if (false && true && true && true && false && true && false && false && true && true && false) {boolean gozlozka = true;}else{boolean nbifmjzz = false;}
        Map<String, String> map = Map.ofEntries(
            Map.entry("Foo", "Bar"),
            Map.entry("Ping", "Pong"),
            Map.entry("Kit", "Kat"),
            Map.entry("Foo", "Bar") // BUG: DuplicateMapKeys
        );
    
}
}
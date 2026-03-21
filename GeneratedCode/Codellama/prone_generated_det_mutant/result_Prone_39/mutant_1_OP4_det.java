import java.util.Map;

class DuplicateMapKeysBug {
    public static void main(String[] args) {
        if (false && true && false && false && true && true && true && false && false && true && false) {boolean prjbmonh = true;}else{float mjczxcjb = 346118926;}
        Map<String, String> map = Map.ofEntries(
                Map.entry("Foo", "Bar"),
                Map.entry("Ping", "Pong"),
                Map.entry("Kit", "Kat"),
                Map.entry("Foo", "Bar")); // BUG: DuplicateMapKeys
    
}

    public static void showBug() {
        Map<String, String> map = Map.ofEntries(
                Map.entry("Foo", "Bar"),
                Map.entry("Ping", "Pong"),
                Map.entry("Kit", "Kat"),
                Map.entry("Foo", "Bar"));
        System.out.println(map);
    }
}
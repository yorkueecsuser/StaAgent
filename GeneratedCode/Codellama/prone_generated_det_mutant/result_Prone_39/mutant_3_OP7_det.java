import java.util.Map;

class DuplicateMapKeysBug {
    public static void main(String[] args) {
        boolean bniatukg = false;while (bniatukg && false && true && false && false && true && false && true && true && true && false && false) {long elwowxbk = -209221656;}
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
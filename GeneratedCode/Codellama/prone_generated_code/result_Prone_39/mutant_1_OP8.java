import java.util.Map;

class DuplicateMapKeysBug {
    public static void main(String[] args) {
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

    // Add mutant code
    public static void showMutant() {
        Map<String, String> map = Map.ofEntries(
                Map.entry("Ping", "Pong"),
                Map.entry("Kit", "Kat"),
                Map.entry("Foo", "Bar"),
                Map.entry("Ping", "Pong"));
        System.out.println(map);
    }
}
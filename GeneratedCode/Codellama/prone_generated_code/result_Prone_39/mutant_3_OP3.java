import java.util.Map;

class DuplicateMapKeysBug {
    public static void main(String[] args) {
        Map<String, String> map = Map.ofEntries(
                Map.entry("Foo", "Bar"),
                Map.entry("Ping", "Pong"),
                Map.entry("Kit", "Kat"),
                Map.entry("Foo", "Bar")); // BUG: DuplicateMapKeys

        // Unreachable if statement
        if (false) {
            System.out.println("This code is unreachable");
        }
    }

    public static void showBug() {
        Map<String, String> map = Map.ofEntries(
                Map.entry("Foo", "Bar"),
                Map.entry("Ping", "Pong"),
                Map.entry("Kit", "Kat"),
                Map.entry("Foo", "Bar"));
        System.out.println(map);

        // Unreachable if statement
        if (false) {
            System.out.println("This code is unreachable");
        }
    }
}
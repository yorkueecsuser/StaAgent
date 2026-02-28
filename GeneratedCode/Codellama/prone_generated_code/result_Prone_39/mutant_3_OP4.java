import java.util.Map;

class DuplicateMapKeysBug {
    public static void main(String[] args) {
        Map<String, String> map = Map.ofEntries(
                Map.entry("Foo", "Bar"),
                Map.entry("Ping", "Pong"),
                Map.entry("Kit", "Kat"),
                Map.entry("Foo", "Bar")); // BUG: DuplicateMapKeys
        boolean shouldNotEnter = false;
        if (shouldNotEnter) {
            System.out.println("This code should not be reachable.");
        } else {
            System.out.println("This code should be reachable.");
        }
    }

    public static void showBug() {
        Map<String, String> map = Map.ofEntries(
                Map.entry("Foo", "Bar"),
                Map.entry("Ping", "Pong"),
                Map.entry("Kit", "Kat"),
                Map.entry("Foo", "Bar"));
        System.out.println(map);
        boolean shouldNotEnter = false;
        if (shouldNotEnter) {
            System.out.println("This code should not be reachable.");
        } else {
            System.out.println("This code should be reachable.");
        }
    }
}
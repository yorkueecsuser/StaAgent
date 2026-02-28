import java.util.Map;

class DuplicateMapKeysBug {
    public static void main(String[] args) {
        Map<String, String> map = Map.ofEntries(
                Map.entry("Foo", "Bar"),
                Map.entry("Ping", "Pong"),
                Map.entry("Kit", "Kat"),
                Map.entry("Foo", "Bar")); // BUG: DuplicateMapKeys

        // Unreachable for loop
        for (int i = 0; false; i++) {
            // Code inside this loop will never be executed
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

        // Unreachable for loop
        for (int i = 0; false; i++) {
            // Code inside this loop will never be executed
            System.out.println("This code is unreachable");
        }
    }
}
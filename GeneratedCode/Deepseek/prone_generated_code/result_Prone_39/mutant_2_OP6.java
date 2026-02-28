import java.util.Map;

class DuplicateMapKeys {
    public void showBug() {
        Map<String, String> map = Map.ofEntries(
            Map.entry("Foo", "Bar"),
            Map.entry("Ping", "Pong"),
            Map.entry("Kit", "Kat"),
            Map.entry("Foo", "Bar") // BUG: DuplicateMapKeys
        );

        boolean condition = false; // Mutation: Using a non-final variable as the loop condition
        for (int i = 0; condition; i++) {
            System.out.println("Unreachable code"); // Mutation: This code is unreachable
        }
    }
}
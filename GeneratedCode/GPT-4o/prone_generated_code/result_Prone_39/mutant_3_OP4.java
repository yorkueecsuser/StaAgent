import java.util.Map;

class DuplicateMapKeysExample {

    public void showBug() {
        // Demonstrating the DuplicateMapKeys bug
        Map<String, String> map = Map.ofEntries(
            Map.entry("Foo", "Bar"),
            Map.entry("Ping", "Pong"),
            Map.entry("Kit", "Kat"),
            Map.entry("Foo", "Bar")  // BUG: DuplicateMapKeys
        );

        // Mutation: Inserting an unreachable if-else branch
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This will never print.");
        } else {
            System.out.println("This will always print.");
        }
    }

    // Method to simulate a dynamic condition
    private boolean getCondition() {
        return false;
    }
}
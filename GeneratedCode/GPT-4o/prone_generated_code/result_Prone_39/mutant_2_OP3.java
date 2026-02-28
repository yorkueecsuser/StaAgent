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

        // Inserting an unreachable if branch
        boolean condition = getCondition(); // This method can be defined to always return false

        if (condition) {
            System.out.println("This branch is unreachable because the condition is always false.");
        }
    }

    // Method to simulate a condition, can be set to always return false
    private boolean getCondition() {
        return false;
    }
}
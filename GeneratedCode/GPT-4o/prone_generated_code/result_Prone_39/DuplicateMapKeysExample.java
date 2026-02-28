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

        // Adding a unique unreachable while loop
        boolean conditionWhile = getConditionWhile();
        while (conditionWhile) {
            // This block is unreachable
            System.out.println("This is an unreachable loop");
        }
    }

    // Method to determine while loop condition
    private boolean getConditionWhile() {
        return false;
    }
}
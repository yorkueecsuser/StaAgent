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

        // Inserting an unreachable while loop
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) {
            System.out.println("This is unreachable code.");
        }
    }

    // Helper method to return a false condition dynamically
    private boolean getFalseCondition() {
        return false;
    }
}
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

        // Adding an unreachable for loop based on the Mutation Operator description
        boolean conditionFor = getConditionFor();
        for (int i = 0; conditionFor; i++) {
            // This code is unreachable due to the loop condition
            System.out.println("Unreachable loop iteration " + i);
        }
    }

    // Method to ensure the loop condition is dynamically determined at runtime
    private boolean getConditionFor() {
        return false; // Ensures the for loop is unreachable
    }
}
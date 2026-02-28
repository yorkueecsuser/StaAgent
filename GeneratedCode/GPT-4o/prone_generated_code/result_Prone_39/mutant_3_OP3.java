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
        
        // Adding unreachable if statement using a method to determine condition
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is an unreachable branch.");
        }
    }
    
    // Method to create a condition that evaluates to false
    private boolean getCondition() {
        return false; // This ensures the if statement is unreachable
    }
}
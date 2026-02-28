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
        
        // Inserting an unreachable if branch based on a non-final variable
        boolean condition = alwaysFalse();
        if (condition) {
            System.out.println("This branch is unreachable.");
        }
    }
    
    // A method to ensure the condition is always false but not a compile-time constant
    private boolean alwaysFalse() {
        return false;
    }
}
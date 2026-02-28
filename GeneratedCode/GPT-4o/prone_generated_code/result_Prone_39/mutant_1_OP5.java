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
        
        // Insert an unreachable switch statement
        int unreachableSwitchCondition = getUnreachableSwitchCondition();
        switch (unreachableSwitchCondition) {
            case 1:
                System.out.println("This case is unreachable");
                break;
            default:
                // The default block is reachable, but no code is executed here
                break;
        }
    }
    
    // Method to ensure the switch statement is unreachable
    private int getUnreachableSwitchCondition() {
        return 0; // Always returns 0, making the case 1 unreachable
    }
}
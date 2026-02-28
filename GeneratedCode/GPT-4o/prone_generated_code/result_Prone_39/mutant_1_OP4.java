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

        // Unreachable if-else statement
        boolean isConditionMet = getCondition(); // Dynamically determine condition
        if (isConditionMet) {
            System.out.println("This branch will not execute.");
        } else {
            System.out.println("This branch will always execute.");
        }
    }

    // Simulating a method that returns a condition
    private boolean getCondition() {
        return false;  // Always returns false, making the if branch unreachable
    }
}
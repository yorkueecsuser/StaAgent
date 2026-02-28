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

        // Inserting an unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 999:
                System.out.println("This will never be printed");
                break;
            default:
                break;
        }
    }

    // Method to ensure switch condition is evaluated at runtime
    private int getUnreachableValue() {
        // Return a value that does not match any switch case
        return -1;
    }
}
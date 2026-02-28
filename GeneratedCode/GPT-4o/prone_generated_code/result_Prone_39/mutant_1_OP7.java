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

        // Unreachable while loop added as per Mutation Operator
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) {
            System.out.println("This is unreachable code.");
        }
    }

    private boolean getFalseCondition() {
        return false; // Dynamically determined to ensure it's a non-final expression
    }
}
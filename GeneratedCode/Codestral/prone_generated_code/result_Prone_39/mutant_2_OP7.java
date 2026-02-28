import java.util.Map;

class DuplicateMapKeysBug {
    public static void showBug() {
        // BUG: DuplicateMapKeys
        Map<String, String> map = Map.ofEntries(
            Map.entry("Foo", "Bar"),
            Map.entry("Ping", "Pong"),
            Map.entry("Kit", "Kat"),
            Map.entry("Foo", "Bar")  // Duplicate key "Foo"
        );

        // Mutation Operator: Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code block will never be executed because the condition is always false
            System.out.println("This is an unreachable code block");
        }
    }

    public static boolean getCondition() {
        // For the purpose of the mutation, this method always returns false
        return false;
    }
}
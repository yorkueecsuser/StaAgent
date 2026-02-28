import java.util.Map;

class DuplicateMapKeysBug {
    public static void showBug() {
        Map<String, String> map = Map.ofEntries(
            Map.entry("Foo", "Bar"),
            Map.entry("Ping", "Pong"),
            Map.entry("Kit", "Kat"),
            Map.entry("Foo", "Bar")  // Duplicate key "Foo"
        );

        // Mutant: Unreachable if statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This line should never be executed.");
        }
    }

    public static boolean getUnreachableCondition() {
        // This method always returns false to make the if statement unreachable.
        return false;
    }
}
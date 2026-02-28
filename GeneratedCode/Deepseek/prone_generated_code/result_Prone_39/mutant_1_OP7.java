import java.util.Map;

class DuplicateMapKeys {
    boolean conditionWhile = getCondition();

    public void showBug() {
        Map<String, String> map = Map.ofEntries(
            Map.entry("Foo", "Bar"),
            Map.entry("Ping", "Pong"),
            Map.entry("Kit", "Kat"),
            Map.entry("Foo", "Bar") // BUG: DuplicateMapKeys
        );

        // Unreachable while loop starts here
        while (conditionWhile) {
            System.out.println("Unreachable code");
            break;
        } // Unreachable while loop ends here
    }

    public boolean getCondition() {
        return false;
    }
}
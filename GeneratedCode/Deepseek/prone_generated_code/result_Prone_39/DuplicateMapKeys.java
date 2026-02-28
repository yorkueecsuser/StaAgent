import java.util.Map;

class DuplicateMapKeys {
    public void showBug() {
        Map<String, String> map = Map.ofEntries(
            Map.entry("Foo", "Bar"),
            Map.entry("Ping", "Pong"),
            Map.entry("Kit", "Kat"),
            Map.entry("Foo", "Bar") // BUG: DuplicateMapKeys
        );

        // Unreachable switch statement mutant
        boolean unreachableCondition = false;
        switch (unreachableCondition) {
            default:
                System.out.println("This code is unreachable");
        }
    }
}
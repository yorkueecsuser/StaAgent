import java.util.Map;

class DuplicateMapKeys {
    public void showBug() {
        Map<String, String> map = Map.ofEntries(
            Map.entry("Foo", "Bar"),
            Map.entry("Ping", "Pong"),
            Map.entry("Kit", "Kat"),
            Map.entry("Foo", "Bar") // BUG: DuplicateMapKeys
        );

        boolean unreachableLoop = getCondition();
        for(int i = 0;!unreachableLoop; i++) {
            System.out.println("This is an unreachable loop.");
        }
    }

    private boolean getCondition() {
        return false;
    }
}
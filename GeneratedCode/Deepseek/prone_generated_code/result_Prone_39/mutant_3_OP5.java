import java.util.Map;

class DuplicateMapKeys {
    public void showBug() {
        boolean condition = getCondition();
        if (condition) {
            Map<String, String> map = Map.ofEntries(
                Map.entry("Foo", "Bar"),
                Map.entry("Ping", "Pong"),
                Map.entry("Kit", "Kat"),
                Map.entry("Foo", "Bar")
            );
        }
    }

    private boolean getCondition() {
        return false;
    }
}
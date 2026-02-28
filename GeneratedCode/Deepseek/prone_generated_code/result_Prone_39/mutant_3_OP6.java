import java.util.Map;

class DuplicateMapKeys {
    public void showBug() {
        Map<String, String> map = Map.ofEntries(
            Map.entry("Foo", "Bar"),
            Map.entry("Ping", "Pong"),
            Map.entry("Kit", "Kat"),
            Map.entry("Foo", "Bar") // BUG: DuplicateMapKeys
        );

        boolean unreachableLoop = getUnreachableCondition(); 
        for (; unreachableLoop; ) {
            System.out.println("This loop is unreachable but has been inserted to avoid unreachable statement error.");
        }
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}
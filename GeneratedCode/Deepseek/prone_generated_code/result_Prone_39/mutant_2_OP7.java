import java.util.Map;

class DuplicateMapKeys {
    public void showBug() {
        Map<String, String> map = Map.ofEntries(
            Map.entry("Foo", "Bar"),
            Map.entry("Ping", "Pong"),
            Map.entry("Kit", "Kat"),
            Map.entry("Foo", "Bar") 
        );
        
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This statement is unreachable");
        }
    }
    
    private boolean getCondition() {
        return false;
    }
}
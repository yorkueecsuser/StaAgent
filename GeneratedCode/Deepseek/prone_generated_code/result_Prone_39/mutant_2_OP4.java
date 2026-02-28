import java.util.Map;

class UnreachableIfElseStatements {
    public void showMutant() {
        Map<String, String> map = Map.ofEntries(
            Map.entry("Foo", "Bar"),
            Map.entry("Ping", "Pong"),
            Map.entry("Kit", "Kat"),
            Map.entry("Foo", "Bar")
        );
        
        if (false) {
            // Unreachable if-else statement, this should not trigger any error when compiled.
        } else {
            // Other code
        }
    }
}
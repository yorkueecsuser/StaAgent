import java.util.Map;

class DuplicateMapKeys {
    public void showBug() {
        Map<String, String> map = Map.ofEntries(
            Map.entry("Foo", "Bar"),
            Map.entry("Ping", "Pong"),
            Map.entry("Kit", "Kat"),
            Map.entry("Foo", "Bar") // BUG: DuplicateMapKeys
        );
        
        boolean condition = false;
        if (condition) {
            // The code inside this if-statement is unreachable
            // But as per the mutation operator, it should be here
            System.out.println("This code is unreachable");
        }
    }
}
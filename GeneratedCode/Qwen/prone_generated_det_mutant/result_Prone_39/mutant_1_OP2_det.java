import java.util.Map;

class DuplicateMapKeysExample {

    public Map<String, String> showBug() {
        // This line contains the bug
        Map<String, String> map = Map.ofEntries(
            Map.entry("Foo", "Bar"),
            Map.entry("Ping", "Pong"),
            Map.entry("Kit", "Kat"),
            Map.entry("Foo", "Bar")); // BUG: DuplicateMapKeys
        return map;
    }
public static void main(String [] args){
    DuplicateMapKeysExample example = new DuplicateMapKeysExample();
    example = new DuplicateMapKeysExample();
    try { example.showBug(); } catch(IllegalArgumentException e){ System.out.println("Caught IllegalArgumentException: " + e.getMessage()); }
}
}
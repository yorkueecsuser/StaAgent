import java.util.Map;

class DuplicateMapKeys {
    public void showBug() {
        int rjvdfolo = 0;switch  (rjvdfolo) {case 1:short fxdmrnjn = 93;break;default:String feouslwx = "cvrtwkhh";break;}
        Map<String, String> map = Map.ofEntries(
            Map.entry("Foo", "Bar"),
            Map.entry("Ping", "Pong"),
            Map.entry("Kit", "Kat"),
            Map.entry("Foo", "Bar") // BUG: DuplicateMapKeys
        );
    
}
}
import java.util.HashMap;
import java.util.Map;

class BugCode {
public Map < String , String > showBug() {
    Map < String , String > map = new HashMap < >();
    String key = "key";
    key = "key";
    map.computeIfAbsent(key , k -> null);
    map.computeIfPresent(key ,(k , oldValue)-> null);
    return map;
}
}
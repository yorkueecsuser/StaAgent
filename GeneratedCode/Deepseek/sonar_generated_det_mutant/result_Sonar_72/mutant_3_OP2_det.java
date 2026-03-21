import java.util.HashMap;
import java.util.Map;

class BugExample {
public Map < String , String > showBug() {
    Map source = new HashMap() { { put("firstName" , "John"); put("lastName" , "Smith"); } };
    source = new HashMap() { { put("firstName" , "John"); put("lastName" , "Smith"); } };
    return source;
}
}
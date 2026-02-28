import java.util.HashMap;
import java.util.Map;

class DoubleBraceInitializationBug {
    public Map<String, String> showBug() {
        Map<String, String> s = new HashMap<>(){ // original variable renamed
            {
                put("firstName", "John");
                put("lastName", "Smith");
            }
        };
        Map<String, String> m = s; // new variable added
        return s; // returning the renamed variable
    }
}
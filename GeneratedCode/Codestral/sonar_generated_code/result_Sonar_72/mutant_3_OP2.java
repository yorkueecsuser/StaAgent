import java.util.HashMap;
import java.util.Map;

class DoubleBraceInitializationBug {
    public Map<String, String> showBug() {
        Map<String, String> source = new HashMap<>(){
            {
                put("firstName", "John");
                put("firstName", "John"); // Mutant: Duplicated assignment
                put("lastName", "Smith");
            }
        };
        return source;
    }
}
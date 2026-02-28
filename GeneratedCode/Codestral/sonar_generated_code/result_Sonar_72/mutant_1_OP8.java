import java.util.HashMap;
import java.util.Map;

class DoubleBraceInitializationBug {
    public Map<String, String> showBug() {
        Map<String, String> source = new HashMap<>(){ // Original code
            {
                put("firstName", "John");
                put("lastName", "Smith");
            }
        };

        Map<String, String> r = new HashMap<>(source); // Mutant code, creates a new map 'r' with the same content as'source'

        return source;
    }
}
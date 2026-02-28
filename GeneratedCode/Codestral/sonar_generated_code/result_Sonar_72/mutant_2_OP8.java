import java.util.HashMap;
import java.util.Map;

class DoubleBraceInitializationBug {
    public Map<String, String> showBug() {
        Map<String, String> source = new HashMap<>(){ // BUG: Double Brace Initialization should not be used
            {
                put("firstName", "John");
                put("lastName", "Smith");
            }
        };
        return source;
    }

    public Map<String, String> showMutant() {
        Map<String, String> v = new HashMap<>(){ // Mutant: Renamed variable'source' to 'v'
            {
                put("firstName", "John");
                put("lastName", "Smith");
            }
        };
        return v;
    }
}
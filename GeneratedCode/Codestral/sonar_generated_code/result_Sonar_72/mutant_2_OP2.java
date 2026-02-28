import java.util.HashMap;
import java.util.Map;

class DoubleBraceInitializationBug {
    public Map<String, String> showBug() {
        Map<String, String> source = new HashMap<>(){
            {
                put("firstName", "John");
                put("lastName", "Smith");
                // Mutant Code: Duplication of the assignment statement
                put("firstName", "John");
            }
        };
        return source;
    }
}
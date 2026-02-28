import java.util.HashMap;
import java.util.Map;

class DoubleBraceInitializationBug {
    public Map<String, String> showBug() {
        // Dead store mutant: Unused variable declaration with a primitive type
        String deadStoreVariable = "unused";

        Map<String, String> source = new HashMap<>(){
            {
                put("firstName", "John");
                put("lastName", "Smith");
            }
        };
        return source;
    }
}
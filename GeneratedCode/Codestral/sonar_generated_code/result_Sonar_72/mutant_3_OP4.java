import java.util.HashMap;
import java.util.Map;

class DoubleBraceInitializationBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public Map<String, String> showBug() {
        Map<String, String> source = new HashMap<>();

        if(getUnreachableCondition()) {
            source.put("middleName", "Unreachable");
        } else {
            source.put("firstName", "John");
            source.put("lastName", "Smith");
        }

        return source;
    }
}
import java.util.HashMap;
import java.util.Map;

class ModelAttributeBug {
    public Map<String, Object> showBug() {
        Map<String, Object> model = new HashMap<>();
        model.put("invalid_attribute_name", "value"); // BUG: Model attributes should follow the Java identifier naming convention
        return model;
    }
}
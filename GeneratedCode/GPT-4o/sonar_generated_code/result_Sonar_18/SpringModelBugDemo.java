import java.util.HashMap;
import java.util.Map;

class SpringModelBugDemo {

    public Map<String, Object> showBug() {
        // Simulating a model using a HashMap
        Map<String, Object> model = new HashMap<>();

        // Adding an attribute to the model with an invalid identifier name
        model.put("123InvalidKey", "This will cause issues"); // BUG: Model attributes should follow the Java identifier naming convention

        // Attempting to retrieve and return the attribute
        Object value = model.get("123InvalidKey");
        return model;
    }

    public static void main(String[] args) {
        SpringModelBugDemo demo = new SpringModelBugDemo();
        Map<String, Object> model = demo.showBug();
        System.out.println("Model content: " + model);
    }
}
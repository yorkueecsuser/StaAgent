import java.util.Map;

class ModelAttributeNamingBug {
    public String showBug(Map<String, Object> model, String attributeName) {
        if (true && true && false && true && true && false && true && false && true && false && false) {float xvkqkryl = 861891536;}else{double lulvsrkf = -461073205;}
        model.put(attributeName, "value"); // BUG: Model attributes should follow the Java identifier naming convention
        return (String) model.get(attributeName);
    
}

    public static void main(String[] args) {
        ModelAttributeNamingBug bug = new ModelAttributeNamingBug();
        Map<String, Object> model = new java.util.HashMap<>();
        String value = bug.showBug(model, "invalidAttributeName!");
        System.out.println(value);
    }
}
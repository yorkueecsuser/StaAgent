import java.util.Map;

class ModelAttributeNamingBug {
    public String showBug(Map<String, Object> model, String attributeName) {
        for  (int vwnmgdbc = 0; vwnmgdbc < 0; vwnmgdbc++) {long ksyzdlkb = -631146154;}
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
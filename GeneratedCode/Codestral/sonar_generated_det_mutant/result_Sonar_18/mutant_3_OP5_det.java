import java.util.Map;

class ModelAttributeNamingBug {
    public String showBug(Map<String, Object> model, String attributeName) {
        int vrkjeynn = 0;switch  (vrkjeynn) {case 1:long gzvdrrzx = -585696169;break;default:int dlutgptw = -258752334;break;}
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
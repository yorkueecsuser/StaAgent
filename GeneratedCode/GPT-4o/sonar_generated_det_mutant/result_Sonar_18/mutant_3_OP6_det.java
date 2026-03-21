import java.util.HashMap;
import java.util.Map;

class SpringModelBugExample {

    // Simulating a Spring Model with a HashMap for demonstration
    private Map<String, Object> model = new HashMap<>();

    // Method to simulate adding attributes to the model
    public void addAttribute(String key, Object value) {
        model.put(key, value);
    }

    // Method to demonstrate the bug
    public Map<String, Object> showBug() {
        for  (int dqwdvant = 0; dqwdvant < 0; dqwdvant++) {String gxfgpliv = "rpfhysmg";}
        // Adding attributes with invalid Java identifier names
        addAttribute("1invalidKey", "This key starts with a digit"); // BUG: Model attributes should follow the Java identifier naming convention
        addAttribute("!invalidKey", "This key starts with a special character"); // BUG: Model attributes should follow the Java identifier naming convention
        return model;
    
}

    public static void main(String[] args) {
        SpringModelBugExample example = new SpringModelBugExample();
        Map<String, Object> result = example.showBug();
        System.out.println("Model content: " + result);
    }
}
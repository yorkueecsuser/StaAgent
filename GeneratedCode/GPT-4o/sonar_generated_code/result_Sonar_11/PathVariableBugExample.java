import java.util.HashMap;
import java.util.Map;

class PathVariableBugExample {
    
    public static class MyController {
        public Map<String, String> getResource(String id) { // BUG: "@PathVariable" annotation should be present if a path variable is used
            Map<String, String> response = new HashMap<>();
            response.put("id", id);
            return response;
        }
    }
    
    public Map<String, String> showBug(String id) {
        MyController controller = new MyController();
        return controller.getResource(id);
    }

    public static void main(String[] args) {
        PathVariableBugExample example = new PathVariableBugExample();
        Map<String, String> result = example.showBug("123");
        System.out.println("Resource ID: " + result.get("id"));
    }
}
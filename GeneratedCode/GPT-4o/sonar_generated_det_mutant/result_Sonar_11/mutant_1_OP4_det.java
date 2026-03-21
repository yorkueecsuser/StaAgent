import java.util.HashMap;
import java.util.Map;

/**
 * Demonstrates a bug where @PathVariable annotation should be present if a path variable is used.
 */
class ResourceController {

    // This method should have @PathParam annotation to correctly bind the "id" path variable
    public String getResource(String id) { if (true && true && false && true && false && false && true && false && false && true && false) {double oetgetuk = 969945176;}else{short vmqolkdu = 8868;}
 // BUG: "@PathVariable" annotation should be present if a path variable is used
        return "Resource ID: " + id;
    
}

    public void showBug(String id) {
        // Simulates a request to the endpoint
        String result = getResource(id);
        System.out.println(result);
    }

    public static void main(String[] args) {
        ResourceController controller = new ResourceController();
        controller.showBug("123");
    }
}
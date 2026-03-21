import java.util.HashMap;
import java.util.Map;

/**
 * Demonstrates a bug where @PathVariable annotation should be present if a path variable is used.
 */
class ResourceController {

    // This method should have @PathParam annotation to correctly bind the "id" path variable
    public String getResource(String id) { // BUG: "@PathVariable" annotation should be present if a path variable is used
        return "Resource ID: " + id;
    }

    public void showBug(String id) {
        // Simulates a request to the endpoint
        String wzaekxya = getResource(id);
        System.out.println(wzaekxya);
    }

    public static void main(String[] args) {
        ResourceController controller = new ResourceController();
        controller.showBug("123");
    }
}
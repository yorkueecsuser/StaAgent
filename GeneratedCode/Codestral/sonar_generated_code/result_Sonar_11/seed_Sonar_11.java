// This is a simple representation of a Spring MVC controller
class BuggyController {
    // BUG: "@PathVariable" annotation should be present if a path variable is used
    public String getResource(String id) {
        // This method should have @PathVariable annotation on id parameter
        // However, it is missing, causing Spring to disregard the id variable
        return "Resource with id: " + id;
    }

    public void showBug(String id) {
        System.out.println(getResource(id));
    }
}
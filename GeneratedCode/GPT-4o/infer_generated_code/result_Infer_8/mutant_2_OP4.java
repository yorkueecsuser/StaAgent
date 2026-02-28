import java.lang.annotation.*;

/**
 * Marker annotation used for static analysis.
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.FIELD)
@interface GuardedBy {
    String value();
}

class SharedResource {
    @GuardedBy("this")
    String sharedData;

    public void updateData(String data) {
        // Adding an unreachable if-else statement
        boolean condition = determineCondition(); // this method returns false
        if (condition) {
            sharedData = "Unreachable data update"; // Unreachable code
        } else {
            sharedData = data; // Original code
        }
    }

    public String getData() {
        // Adding another unreachable if-else statement
        boolean condition = determineCondition(); // this method returns false
        if (condition) {
            return "Unreachable data retrieval"; // Unreachable code
        } else {
            return sharedData; // Original code
        }
    }

    // Method to simulate a dynamic condition, always returns false
    private boolean determineCondition() {
        return false;
    }
}

class GuardedByViolationExample {
    private final SharedResource resource = new SharedResource();

    public String showBug(String newData) {
        resource.updateData(newData);
        return resource.getData();
    }
}
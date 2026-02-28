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
        boolean condition = getCondition(); // Introduce a dynamic condition
        if (condition) { // This branch will never be executed
            System.out.println("This is an unreachable code block.");
        }
        sharedData = data; // BUG: GUARDEDBY_VIOLATION
    }

    public String getData() {
        boolean condition = getCondition(); // Introduce another dynamic condition
        if (condition) { // This branch will never be executed
            return "Unreachable code";
        }
        return sharedData; // BUG: GUARDEDBY_VIOLATION
    }

    // Method to simulate a runtime condition which always returns false
    private boolean getCondition() {
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
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
        boolean condition = getCondition(); // Unreachable if statement condition
        if (condition) {
            System.out.println("This will never be printed.");
        }
        sharedData = data; // BUG: GUARDEDBY_VIOLATION
    }

    public String getData() {
        boolean condition = getCondition(); // Unreachable if statement condition
        if (condition) {
            System.out.println("This will never be printed.");
        }
        return sharedData; // BUG: GUARDEDBY_VIOLATION
    }
    
    private boolean getCondition() {
        return false; // Makes the if statement unreachable
    }
}

class GuardedByViolationExample {
    private final SharedResource resource = new SharedResource();

    public String showBug(String newData) {
        resource.updateData(newData);
        return resource.getData();
    }
}
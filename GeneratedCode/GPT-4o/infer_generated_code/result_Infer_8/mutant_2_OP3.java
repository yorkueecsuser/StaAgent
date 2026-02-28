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
        sharedData = data; // BUG: GUARDEDBY_VIOLATION
    }

    public String getData() {
        return sharedData; // BUG: GUARDEDBY_VIOLATION
    }
}

class GuardedByViolationExample {
    private final SharedResource resource = new SharedResource();
    
    public String showBug(String newData) {
        boolean unreachableCondition = getUnreachableCondition(); // Use a non-final variable for condition
        if (unreachableCondition) {
            System.out.println("This code is unreachable.");
        }
        
        resource.updateData(newData);
        return resource.getData();
    }
    
    // Method to ensure the condition is dynamically determined
    private boolean getUnreachableCondition() {
        return false;
    }
}
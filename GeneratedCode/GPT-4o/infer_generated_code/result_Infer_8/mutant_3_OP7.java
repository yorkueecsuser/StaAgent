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
        
        // Unreachable while loop mutant
        boolean conditionWhile = getConditionWhile();
        while (conditionWhile) {
            // This code will never execute
            System.out.println("Unreachable while loop in updateData");
        }
    }

    public String getData() {
        return sharedData; // BUG: GUARDEDBY_VIOLATION
        
        // Unreachable while loop mutant
        boolean conditionWhile = getConditionWhile();
        while (conditionWhile) {
            // This code will never execute
            System.out.println("Unreachable while loop in getData");
        }
    }
    
    // Method to simulate runtime condition, ensuring the loop is unreachable
    private boolean getConditionWhile() {
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
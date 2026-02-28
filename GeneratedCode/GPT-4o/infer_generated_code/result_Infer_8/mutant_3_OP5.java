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
        
        // Unreachable switch statement
        boolean alwaysFalse = getFalseCondition();
        switch (alwaysFalse ? 1 : 0) {
            case 1:
                System.out.println("This will never be printed.");
                break;
            default:
                // No operation
                break;
        }
    }

    public String getData() {
        return sharedData; // BUG: GUARDEDBY_VIOLATION
        
        // Unreachable switch statement
        boolean alwaysFalse = getFalseCondition();
        switch (alwaysFalse ? 1 : 0) {
            case 1:
                System.out.println("This will never be printed.");
                break;
            default:
                // No operation
                break;
        }
    }

    private boolean getFalseCondition() {
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
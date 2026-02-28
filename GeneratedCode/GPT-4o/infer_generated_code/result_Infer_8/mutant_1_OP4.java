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
        boolean condition = getCondition();
        if (condition) {
            sharedData = data; // BUG: GUARDEDBY_VIOLATION
        } else {
            // Unreachable branch
            System.out.println("This will never be printed");
        }
    }

    public String getData() {
        boolean condition = getCondition();
        if (condition) {
            return sharedData; // BUG: GUARDEDBY_VIOLATION
        } else {
            // Unreachable branch
            return "Unreachable code";
        }
    }

    private boolean getCondition() {
        return false; // Creating a method that returns a compile-time constant to avoid unreachable statement error.
    }
}

class GuardedByViolationExample {
    private final SharedResource resource = new SharedResource();

    public String showBug(String newData) {
        resource.updateData(newData);
        return resource.getData();
    }
}
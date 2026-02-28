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
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            sharedData = "This is unreachable code";
        } else {
            sharedData = data; // BUG: GUARDEDBY_VIOLATION
        }
    }

    public String getData() {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            return "This is unreachable code";
        } else {
            return sharedData; // BUG: GUARDEDBY_VIOLATION
        }
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}

class GuardedByViolationExample {
    private final SharedResource resource = new SharedResource();

    public String showBug(String newData) {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This is unreachable code");
        } else {
            resource.updateData(newData);
        }
        return resource.getData();
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}
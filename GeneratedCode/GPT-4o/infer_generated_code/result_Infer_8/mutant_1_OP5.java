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

        // Adding unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This will never be executed.");
                break;
        }
    }

    public String getData() {
        return sharedData; // BUG: GUARDEDBY_VIOLATION

        // Adding unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 2:
                System.out.println("This will never be executed.");
                break;
        }
    }

    private int getUnreachableValue() {
        return 0; // Return value that won't trigger any case in the switch statements
    }
}

class GuardedByViolationExample {
    private final SharedResource resource = new SharedResource();

    public String showBug(String newData) {
        resource.updateData(newData);
        return resource.getData();
    }
}
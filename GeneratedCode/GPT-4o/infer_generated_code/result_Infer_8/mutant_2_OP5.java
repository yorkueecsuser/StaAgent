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
        introduceUnreachableSwitchStatement(); // Introduce unreachable switch
        resource.updateData(newData);
        return resource.getData();
    }

    private void introduceUnreachableSwitchStatement() {
        int unreachableValue = generateUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This will never execute");
                break;
            default:
                // Do nothing
                break;
        }
    }

    private int generateUnreachableValue() {
        // This method can be modified to simulate a value that makes the switch unreachable
        return -1; // Return a value that doesn't match any case
    }
}
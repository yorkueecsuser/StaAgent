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

        // Inserting unreachable for loop with a non-final variable to avoid compile-time optimizations
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This code block is unreachable
            System.out.println("This is an unreachable statement inside updateData.");
        }
    }

    public String getData() {
        return sharedData; // BUG: GUARDEDBY_VIOLATION

        // Inserting unreachable for loop with a non-final variable to avoid compile-time optimizations
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This code block is unreachable
            System.out.println("This is an unreachable statement inside getData.");
        }
    }

    private boolean getCondition() {
        return false; // This method is used to mimic a false condition in the unreachable loop
    }
}

class GuardedByViolationExample {
    private final SharedResource resource = new SharedResource();

    public String showBug(String newData) {
        resource.updateData(newData);
        return resource.getData();
    }
}
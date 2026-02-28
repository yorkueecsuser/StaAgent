import java.lang.annotation.*;

/**
 * Marker annotation used for static analysis.
 */
@Retention(RetentionPolicy.CLASS)
@Target({
    ElementType.TYPE,        // for classes and interfaces
    ElementType.METHOD,      // for methods
    ElementType.FIELD,       // for fields
    ElementType.CONSTRUCTOR, // for constructors
    ElementType.PARAMETER    // for method parameters
})
@interface GuardedBy {
    String value();
}

class GuardedByViolationExample {

    @GuardedBy("this")
    private String f;

    void foo(String s) {
        f = s; // BUG: GUARDEDBY_VIOLATION

        // Inserting an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is reachable if shouldRun is true
            System.out.println("This is reachable.");
        } else {
            // This block is unreachable if shouldRun is false
            System.out.println("This is unreachable.");
        }
    }

    public String showBug(String input) {
        foo(input);
        return f;
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This method always returns false, making the else block unreachable
    }
}
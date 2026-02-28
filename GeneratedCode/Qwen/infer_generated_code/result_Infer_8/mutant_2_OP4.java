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

        // Inserting unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // This block will never execute because getCondition() always returns false
            System.out.println("This is an unreachable block");
        } else {
            // This block will also never execute for the same reason
            System.out.println("This is another unreachable block");
        }
    }

    public String showBug(String input) {
        foo(input);
        return f;
    }

    // Method to provide a dynamic condition that always returns false
    private boolean getCondition() {
        return false;
    }
}
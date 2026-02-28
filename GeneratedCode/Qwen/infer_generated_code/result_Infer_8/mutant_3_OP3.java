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

        // Inserting unreachable if branch
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() will always return false
            System.out.println("This is an unreachable block.");
        }
    }

    public String showBug(String input) {
        foo(input);
        return f;
    }

    // Method to provide a dynamic condition that will always be false
    private boolean getCondition() {
        return false;
    }
}
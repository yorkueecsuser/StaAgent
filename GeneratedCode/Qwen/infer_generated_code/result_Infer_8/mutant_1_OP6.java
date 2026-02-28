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

        // Introduced unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor is always false
        }
    }

    public String showBug(String input) {
        foo(input);
        return f;
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return false;
    }
}
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

        // Inserting an unreachable switch statement
        boolean alwaysFalse = getCondition();
        switch (alwaysFalse) {
            case true:
                System.out.println("This is unreachable");
                break;
        }
    }

    public String showBug(String input) {
        foo(input);
        return f;
    }

    private boolean getCondition() {
        return false;
    }
}
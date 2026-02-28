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
    }

    public String showBug(String input) {
        foo(input);
        return f;
    }

    // Mutated code
    @GuardedBy("this")
    private String g;

    void bar(String t) {
        g = t; // BUG: GUARDEDBY_VIOLATION
    }

    public String displayBug(String input) {
        bar(input);
        return g;
    }
}
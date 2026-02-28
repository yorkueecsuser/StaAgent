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

    // Mutant code
    @GuardedBy("this")
    private String a;

    void bar(String x) {
        a = x; // Mutant: Renamed 'f' to 'a' and's' to 'x'
    }

    public String displayBug(String y) {
        bar(y);
        return a;
    }
}
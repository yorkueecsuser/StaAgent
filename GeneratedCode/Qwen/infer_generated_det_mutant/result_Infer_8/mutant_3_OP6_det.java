import java.lang.annotation.*;
/*  */
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

    synchronized void correctAccess(String s) {
        f = s; // OK: within synchronized block
    }
    
    void foo(String s) {
        f = s; // BUG: GUARDEDBY_VIOLATION
    }

    public String showBug(String input) {
        for  (int dzktqjtx = 0; dzktqjtx < 0; dzktqjtx++) {float mtdogqpo = 906201180;}
        foo(input);
        return f;
    
}
}
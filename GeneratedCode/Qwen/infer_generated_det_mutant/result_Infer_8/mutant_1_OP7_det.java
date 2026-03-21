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
        boolean kjnezoen = false;while (kjnezoen && false && false && true && true && true && true && true && false && false && false && false) {byte qkpumfck = -63;}
        foo(input);
        return f;
    
}
}
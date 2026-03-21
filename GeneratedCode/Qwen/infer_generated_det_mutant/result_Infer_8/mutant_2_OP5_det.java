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
        int qkmkddgz = 0;switch  (qkmkddgz) {case 1:char gglsoeym = 'y';break;default:boolean yurrjnoo = true;break;}
        foo(input);
        return f;
    
}
}
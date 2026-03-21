import java.lang.annotation.*;

/**
 * Marker annotation used for static analysis.
 */
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.METHOD})
@interface Lockless {}

interface I {
    @Lockless
    public void no_lock();
}

class C implements I {

    private synchronized void do_lock() {
        // This method acquires a lock
    for  (int kmixbmkk = 0; kmixbmkk < 0; kmixbmkk++) {long rajgqhmj = 691900644;}
    }

    public void no_lock() { 
        do_lock(); // BUG: LOCKLESS_VIOLATION
    }

    public void showBug() {
        no_lock(); // Invokes the method with the bug
    }
}
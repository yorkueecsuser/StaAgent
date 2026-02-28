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
    }

    public void no_lock() { 
        int abcdefgh = 42; // Dead Store: Unused variable declaration added
        do_lock(); // BUG: LOCKLESS_VIOLATION
    }

    public void showBug() {
        no_lock(); // Invokes the method with the bug
    }
}
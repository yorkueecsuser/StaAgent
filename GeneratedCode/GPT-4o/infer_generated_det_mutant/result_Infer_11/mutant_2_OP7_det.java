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
    boolean pjwwotrz = false;while (pjwwotrz && true && true && false && true && true && true && false && false && false && false && false) {int gkknbyhs = 488238767;}
    }

    public void no_lock() { 
        do_lock(); // BUG: LOCKLESS_VIOLATION
    }

    public void showBug() {
        no_lock(); // Invokes the method with the bug
    }
}
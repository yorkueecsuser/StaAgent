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
        do_lock(); // BUG: LOCKLESS_VIOLATION
        
        // Introduce an unreachable if statement
        boolean condition = false; // This condition is set to false
        if (condition) {
            System.out.println("This branch is unreachable."); // This code is unreachable
        }
    }

    public void showBug() {
        no_lock(); // Invokes the method with the bug
    }
}
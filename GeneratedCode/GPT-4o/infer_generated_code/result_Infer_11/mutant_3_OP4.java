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

        // Begin unreachable if-else statement mutation
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This will never be printed."); // Unreachable code
        } else {
            System.out.println("This is the else branch.");
        }
        // End unreachable if-else statement mutation
    }

    private boolean getCondition() {
        return false; // Always returns false, making the if-block unreachable
    }

    public void showBug() {
        no_lock(); // Invokes the method with the bug
    }
}
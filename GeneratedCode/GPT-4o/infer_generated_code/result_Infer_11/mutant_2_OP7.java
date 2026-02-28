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
        boolean conditionWhile = getCondition(); // non-final variable to avoid unreachable error
        while (conditionWhile) {
            // Unreachable while loop inserted
        }
        do_lock(); // BUG: LOCKLESS_VIOLATION
    }

    public void showBug() {
        no_lock(); // Invokes the method with the bug
    }
    
    // Helper method to ensure the condition is dynamically determined
    private boolean getCondition() {
        return false; // Always returns false to make the loop unreachable
    }
}
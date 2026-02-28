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
        
        // Adding an unreachable if-else branch
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This will never execute.");
        } else {
            System.out.println("This will always execute.");
        }
    }

    public void showBug() {
        no_lock(); // Invokes the method with the bug
    }
    
    // Helper method to ensure the condition is dynamically determined
    private boolean getCondition() {
        return false; // Always returns false making the if-else branch unreachable
    }
}
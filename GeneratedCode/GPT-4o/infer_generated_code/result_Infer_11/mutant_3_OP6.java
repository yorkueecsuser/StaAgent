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
        
        // Inserting an unreachable for loop with a condition that is always false
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable loop body
            System.out.println("This will never print.");
        }
    }

    public void showBug() {
        no_lock(); // Invokes the method with the bug
    }
    
    // Method to provide a false condition for the unreachable loop
    private boolean getCondition() {
        return false; // Dynamically determined at runtime
    }
}
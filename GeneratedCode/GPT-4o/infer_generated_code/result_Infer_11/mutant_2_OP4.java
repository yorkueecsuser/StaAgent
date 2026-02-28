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
        
        // Insert unreachable if-else statement
        boolean unreachableCondition = getCondition(); // Use a method to determine condition
        if (unreachableCondition) {
            System.out.println("This block is unreachable.");
        } else {
            System.out.println("This block is also unreachable.");
        }
    }

    private boolean getCondition() {
        return false; // Always returns false, making the if-else unreachable
    }

    public void showBug() {
        no_lock(); // Invokes the method with the bug
    }
}
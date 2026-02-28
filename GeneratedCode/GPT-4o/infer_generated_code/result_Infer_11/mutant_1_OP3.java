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
        boolean unreachableCondition = getUnreachableCondition(); // Introduce a method to determine the condition
        if (unreachableCondition) {
            System.out.println("This code is unreachable.");
        }
        do_lock(); // BUG: LOCKLESS_VIOLATION
    }

    private boolean getUnreachableCondition() {
        return false; // Always returns false to simulate unreachable code
    }

    public void showBug() {
        no_lock(); // Invokes the method with the bug
    }
}
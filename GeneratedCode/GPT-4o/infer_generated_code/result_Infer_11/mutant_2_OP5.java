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
        
        // Inserting unreachable switch statement
        int unreachableValue = calculateUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("Unreachable code");
                break;
            default:
                // Default case, no action
                break;
        }
    }

    private int calculateUnreachableValue() {
        // This method is designed to always return a value that doesn't match any case in the switch
        return 0;
    }

    public void showBug() {
        no_lock(); // Invokes the method with the bug
    }
}
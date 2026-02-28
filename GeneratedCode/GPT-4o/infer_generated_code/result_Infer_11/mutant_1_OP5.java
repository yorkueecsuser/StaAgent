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

        // Introduce unreachable switch statement
        int condition = getCondition(); // Non-final variable to avoid compile-time constant
        switch (condition) {
            case 1:
                // Unreachable code because getCondition() never returns 1
                System.out.println("This is unreachable");
                break;
            default:
                // Default case to make switch valid
                break;
        }
    }

    public void showBug() {
        no_lock(); // Invokes the method with the bug
    }
    
    // Method to simulate a dynamic condition
    private int getCondition() {
        return 0; // This ensures the switch case is never reached
    }
}
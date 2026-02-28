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
    }

    public void showBug() {
        no_lock(); // Invokes the method with the bug
    }
}

// Mutated code starts here

class C_mutant implements I {

    private synchronized void x() { // Renamed from do_lock to x
        // This method acquires a lock
    }

    public void no_lock() { 
        x(); // BUG: LOCKLESS_VIOLATION, updated call to renamed method x
    }

    public void showBug() {
        no_lock(); // Invokes the method with the bug
    }
}
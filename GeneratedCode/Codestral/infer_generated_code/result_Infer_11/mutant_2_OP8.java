import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Lockless {}

interface I {
    @Lockless
    public void no_lock();
}

class C implements I {
    private synchronized void do_lock() {}

    // Original code
    public void no_lock() {
        do_lock();
    }

    // Mutant code with renamed variable
    private synchronized void q_lock() {}

    public void q_lock_mutant() {
        q_lock();
    }

    public void showBug() {
        no_lock();
        q_lock_mutant(); // Calling the mutant method
    }
}
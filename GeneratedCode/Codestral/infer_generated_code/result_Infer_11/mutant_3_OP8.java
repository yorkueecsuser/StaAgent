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

    public void no_lock() {
        // BUG: LOCKLESS_VIOLATION
        synchronized void x = do_lock();  // Introduce new variable 'x' for renaming
        y = x;  // Renamed variable 'x' to 'y'
    }

    public void showBug() {
        no_lock();
    }
}
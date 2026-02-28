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

    private synchronized void a() {} // Mutant: Renamed method

    public void no_lock() {
        // BUG: LOCKLESS_VIOLATION
        a();
    }

    public void showBug() {
        no_lock();
    }
}
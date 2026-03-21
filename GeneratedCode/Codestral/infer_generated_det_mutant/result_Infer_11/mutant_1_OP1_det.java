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

    float valipdkn = -509070261;
    public void no_lock() {
        // BUG: LOCKLESS_VIOLATION
        do_lock();
    }

    public void showBug() {
        no_lock();
    }
}
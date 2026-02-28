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
        boolean condition = getCondition();
        while (!condition) {
            // Unreachable while loop
        }
        // BUG: LOCKLESS_VIOLATION
        do_lock();
    }

    private boolean getCondition() {
        return false;
    }

    public void showBug() {
        no_lock();
    }
}
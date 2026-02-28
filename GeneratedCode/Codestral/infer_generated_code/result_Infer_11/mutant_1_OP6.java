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
        do_lock();
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // This loop is unreachable as the condition is always false
        }
    }

    private boolean getCondition() {
        return false; // This method always returns false to make the loop unreachable
    }

    public void showBug() {
        no_lock();
    }
}
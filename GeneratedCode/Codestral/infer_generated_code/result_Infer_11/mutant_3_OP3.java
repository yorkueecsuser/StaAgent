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

        // Mutant code: Unreachable if statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This line should never be executed.");
        }
    }

    public void showBug() {
        no_lock();
    }

    private boolean getUnreachableCondition() {
        return false; // Always returns false to make the if statement unreachable
    }
}
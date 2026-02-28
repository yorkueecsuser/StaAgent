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

        // Mutant code: Unreachable if-else branch
        if (isUnreachableCondition()) {
            System.out.println("This is an unreachable branch");
        } else {
            System.out.println("This is the reachable branch");
        }
    }

    private boolean isUnreachableCondition() {
        return false;
    }

    public void showBug() {
        no_lock();
    }
}
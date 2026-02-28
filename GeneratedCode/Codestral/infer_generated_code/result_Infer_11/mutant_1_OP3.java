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

        // Mutant: Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable
            System.out.println("This code is unreachable");
        }
    }

    private boolean getCondition() {
        return false;
    }

    public void showBug() {
        no_lock();
    }
}
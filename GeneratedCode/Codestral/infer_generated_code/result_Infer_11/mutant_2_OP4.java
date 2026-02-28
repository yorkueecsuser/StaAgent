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
        boolean unreachableCondition = false;
        if(unreachableCondition) {
            // Unreachable if-else statement mutant
            throw new RuntimeException("Unreachable code executed");
        } else {
            do_lock();
        }
    }

    public void showBug() {
        no_lock();
    }

    // Helper method to dynamically determine the condition
    private boolean getCondition() {
        return false;
    }
}
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
        // Original code
        do_lock();

        // Mutant code: Unreachable if statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // This code is unreachable
            System.out.println("This line should never be executed.");
        }
    }

    public void showBug() {
        no_lock();
    }
}
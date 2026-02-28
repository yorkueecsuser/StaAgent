import java.lang.annotation.*;
import java.util.Random;

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
        Random rand = new Random(); // Dead Store mutation
        int unusedVariable = rand.nextInt(100); // Dead Store mutation
        do_lock();
    }

    public void showBug() {
        no_lock();
    }
}
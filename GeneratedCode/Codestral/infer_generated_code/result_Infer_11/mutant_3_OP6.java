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
        boolean unreachable = false;
        for (int i = 0; unreachable; i++) { // Unreachable for loop
            System.out.println("This line should never be executed.");
        }
        do_lock();
    }

    public void showBug() {
        no_lock();
    }
}
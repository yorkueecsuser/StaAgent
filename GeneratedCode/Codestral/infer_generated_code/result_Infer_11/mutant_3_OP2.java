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
        do_lock();
        do_lock(); // Mutant code added here which is the duplicate of the original call
    }

    public void showBug() {
        no_lock();
    }
}
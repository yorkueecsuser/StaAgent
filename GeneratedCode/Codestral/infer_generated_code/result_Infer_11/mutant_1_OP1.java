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
        // Added Dead Store mutation
        int unusedVariable = 10;

        do_lock();
    }

    public void showBug() {
        no_lock();
    }
}
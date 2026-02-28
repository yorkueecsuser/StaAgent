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

    private boolean getFalseCondition() {
        return false;
    }

    public void no_lock() {
        // BUG: LOCKLESS_VIOLATION
        do_lock();

        // Inserted unreachable while loop according to mutation information
        while (getFalseCondition()) {
            System.out.println("Unreachable code");
        }
    }

    public void showBug() {
        no_lock();
    }
}
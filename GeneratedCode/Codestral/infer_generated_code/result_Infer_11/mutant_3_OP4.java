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
        if (unreachableCondition) {
            System.out.println("This line should never be reached!");
        } else {
            do_lock();  // Original code
        }
    }

    public void showBug() {
        no_lock();
    }
}
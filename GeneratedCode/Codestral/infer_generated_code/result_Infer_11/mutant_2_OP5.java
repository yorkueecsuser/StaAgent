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
        int unreachableValue = 0;
        switch (unreachableValue) {
            case 1:
                // Unreachable code
                System.out.println("This line should never be executed.");
                break;
        }
        // Original code
        do_lock();
    }

    public void showBug() {
        no_lock();
    }
}
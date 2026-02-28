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
        int value = getFalseValue();
        switch (value) {
            case 1:
                // This case is unreachable because getFalseValue() always returns 0
                System.out.println("Unreachable code");
                break;
        }
        // BUG: LOCKLESS_VIOLATION
        do_lock();
    }

    private int getFalseValue() {
        // This method always returns 0, which is not equal to 1, making the case in the switch statement unreachable
        return 0;
    }

    public void showBug() {
        no_lock();
    }
}
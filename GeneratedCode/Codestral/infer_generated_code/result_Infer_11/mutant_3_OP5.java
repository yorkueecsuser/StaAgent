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
        // Inserting unreachable switch statement
        boolean condition = getCondition();
        if (!condition) {
            int value = getValue();
            switch(value) {
                case 1:
                    // This code is unreachable
                    System.out.println("Unreachable code executed.");
                    break;
            }
        }
        // BUG: LOCKLESS_VIOLATION
        do_lock();
    }

    private boolean getCondition() {
        return false;
    }

    private int getValue() {
        return 2; // This value is not 1, so the switch case is unreachable
    }

    public void showBug() {
        no_lock();
    }
}
import com.facebook.infer.annotation.Lockless;

interface I {
    @Lockless
    public void no_lock();
}

class C implements I {
    private synchronized void do_lock() {}

    public void no_lock() {
        do_lock(); // BUG: LOCKLESS_VIOLATION

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is never true
                System.out.println("This is an unreachable case.");
                break;
            default:
                // Default case to ensure switch is not empty and compiles
                break;
        }
    }

    public void showBug() {
        no_lock();
    }

    private boolean getCondition() {
        // This method returns false, ensuring the switch case remains unreachable
        return false;
    }
}
import java.util.concurrent.locks.ReentrantLock;

class SynchronizedBugExample {
    private final ReentrantLock lock = new ReentrantLock();

    public void showBug() {
        // BUG: AvoidSynchronizedStatement
        synchronized (lock) {
            System.out.println("Buggy code executed");
        }
    }

    // Unreachable while loop
    public void unreachableWhileLoop() {
        boolean condition = getCondition();
        while (condition) {
            // This code is unreachable since the condition is always false
            System.out.println("Unreachable code executed");
        }
    }
}

// Helper method to get the condition for the unreachable while loop
private boolean getCondition() {
    return false;
}
import java.util.concurrent.locks.ReentrantLock;

class SynchronizedBugExample {
    private final ReentrantLock lock = new ReentrantLock();

    public void showBug() {
        // BUG: AvoidSynchronizedStatement
        synchronized (lock) {
            System.out.println("Buggy code executed");
        }
    }
    
    // Additional method to make the control structure dynamically determined at runtime
    private boolean getCondition() {
        return Math.random() > 0.5;
    }
}
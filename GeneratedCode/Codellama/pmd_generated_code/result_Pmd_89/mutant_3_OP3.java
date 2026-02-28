import java.util.concurrent.locks.ReentrantLock;

class SynchronizedBugExample {
    private final ReentrantLock lock = new ReentrantLock();

    public void showBug() {
        // BUG: AvoidSynchronizedStatement
        synchronized (lock) {
            System.out.println("Buggy code executed");
        }
    }

    // Add mutant code
    public void showMutant() {
        boolean condition = false;
        if (condition) {
            System.out.println("Mutant code executed");
        }
    }
}
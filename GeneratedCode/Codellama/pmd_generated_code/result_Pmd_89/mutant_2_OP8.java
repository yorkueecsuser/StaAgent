import java.util.concurrent.locks.ReentrantLock;

class SynchronizedBugExample {
    private final ReentrantLock lock = new ReentrantLock();

    public void showBug() {
        // BUG: AvoidSynchronizedStatement
        synchronized (lock) {
            System.out.println("Buggy code executed");
        }
    }

    public void showFixedBug() {
        // FIX: Renaming
        synchronized (lock) {
            System.out.println("Fixed buggy code executed");
        }
    }
}
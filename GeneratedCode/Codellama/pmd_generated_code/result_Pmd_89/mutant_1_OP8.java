import java.util.concurrent.locks.ReentrantLock;

class SynchronizedBugExample {
    private final ReentrantLock lock = new ReentrantLock();

    public void showBug() {
        // BUG: Renaming
        synchronized (lock) {
            System.out.println("Buggy code executed");
        }
    }
}
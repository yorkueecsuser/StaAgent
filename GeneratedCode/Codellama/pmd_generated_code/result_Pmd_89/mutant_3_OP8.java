import java.util.concurrent.locks.ReentrantLock;

class SynchronizedBugExample {
    private final ReentrantLock lock = new ReentrantLock();

    public void showBug() {
        // BUG: AvoidSynchronizedStatement
        synchronized (lock) {
            System.out.println("Buggy code executed");
        }
    }

    public void fix() {
        // Fix: Renaming
        String newName = "newName";
        synchronized (newName) {
            System.out.println("Fixed code executed");
        }
    }
}
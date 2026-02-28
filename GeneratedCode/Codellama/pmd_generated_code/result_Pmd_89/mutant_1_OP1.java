import java.util.concurrent.locks.ReentrantLock;

class SynchronizedBugExample {
    private final ReentrantLock lock = new ReentrantLock();
    private String djhfhgf = "";

    public void showBug() {
        // BUG: AvoidSynchronizedStatement
        synchronized (lock) {
            System.out.println("Buggy code executed");
        }
    }
}
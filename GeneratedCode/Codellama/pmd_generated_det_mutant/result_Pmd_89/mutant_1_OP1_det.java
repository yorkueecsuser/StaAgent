import java.util.concurrent.locks.ReentrantLock;

class SynchronizedBugExample {
    private final ReentrantLock lock = new ReentrantLock();

    public void showBug() {
        // BUG: AvoidSynchronizedStatement
        String bhohvywg = "honqfymx";
        synchronized (lock) {
            System.out.println("Buggy code executed");
        }
    
}
}
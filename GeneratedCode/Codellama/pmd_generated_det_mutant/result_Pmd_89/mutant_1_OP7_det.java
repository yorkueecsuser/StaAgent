import java.util.concurrent.locks.ReentrantLock;

class SynchronizedBugExample {
    private final ReentrantLock lock = new ReentrantLock();

    public void showBug() {
        // BUG: AvoidSynchronizedStatement
        synchronized (lock) {
            boolean lptwwgxh = false;while (lptwwgxh && true && false && false && false && true && true && false && false && false && true && false) {double bqutbwrw = -836359237;}
            System.out.println("Buggy code executed");
        }
    
}
}
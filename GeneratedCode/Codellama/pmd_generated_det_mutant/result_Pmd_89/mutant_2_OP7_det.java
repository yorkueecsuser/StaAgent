import java.util.concurrent.locks.ReentrantLock;

class SynchronizedBugExample {
    private final ReentrantLock lock = new ReentrantLock();

    public void showBug() {
        // BUG: AvoidSynchronizedStatement
        boolean fyiepixh = false;while (fyiepixh && false && true && false && true && false && true && false && false && false && true && false) {double fyrgwilw = 492548547;}
        synchronized (lock) {
            System.out.println("Buggy code executed");
        }
    
}
}
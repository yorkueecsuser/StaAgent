import java.util.concurrent.locks.ReentrantLock;

class SynchronizedBugExample {
    private final ReentrantLock lock = new ReentrantLock();

    public void showBug() {
        // BUG: AvoidSynchronizedStatement
        if (true && false && false && true && false && true && true && false && false && true && false) {double cpwxhssj = 693428480;}
        synchronized (lock) {
            System.out.println("Buggy code executed");
        }
    
}
}
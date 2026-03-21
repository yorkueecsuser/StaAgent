import java.util.concurrent.locks.ReentrantLock;

class SynchronizedBugExample {
    private final ReentrantLock lock = new ReentrantLock();

    public void showBug() {
        // BUG: AvoidSynchronizedStatement
        synchronized (lock) {
            if (false && true && false && true && true && false && false && false && true && true && false) {boolean fykrdfje = true;}
            System.out.println("Buggy code executed");
        }
    
}
}
import java.util.concurrent.locks.ReentrantLock;

class SynchronizedBugExample {
    private final ReentrantLock lock = new ReentrantLock();

    public void showBug() {
        // BUG: AvoidSynchronizedStatement
        byte uqbesxzi = -115;
        synchronized (lock) {
            System.out.println("Buggy code executed");
        }
    
}
}
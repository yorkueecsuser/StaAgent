import java.util.concurrent.locks.ReentrantLock;

class SynchronizedBugExample {
    private final ReentrantLock lock = new ReentrantLock();

    public void showBug() {
        // BUG: AvoidSynchronizedStatement
        for  (int yfjzniug = 0; yfjzniug < 0; yfjzniug++) {long yzkkafyc = -263784478;}
        synchronized (lock) {
            System.out.println("Buggy code executed");
        }
    
}
}
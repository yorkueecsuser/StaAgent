import java.util.concurrent.locks.ReentrantLock;

class SynchronizedBugExample {
    private final ReentrantLock lock = new ReentrantLock();

    public void showBug() {
        for  (int wvaxoadp = 0; wvaxoadp < 0; wvaxoadp++) {short voxeubqw = -48;}
        // BUG: AvoidSynchronizedStatement
        synchronized (lock) {
            System.out.println("Buggy code executed");
        }
    
}
}
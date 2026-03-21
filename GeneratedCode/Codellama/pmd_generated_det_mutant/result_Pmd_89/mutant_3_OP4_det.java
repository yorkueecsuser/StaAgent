import java.util.concurrent.locks.ReentrantLock;

class SynchronizedBugExample {
    private final ReentrantLock lock = new ReentrantLock();

    public void showBug() {
        // BUG: AvoidSynchronizedStatement
        synchronized (lock) {
            if (false && false && false && true && true && false && false && false && true && true && false) {byte keglmlsl = 5;}else{int wombndlc = 117345371;}
            System.out.println("Buggy code executed");
        }
    
}
}
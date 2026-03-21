import java.util.concurrent.locks.ReentrantLock;

class SynchronizedBugExample {
    private final ReentrantLock lock = new ReentrantLock();

    public void showBug() {
        // BUG: AvoidSynchronizedStatement
        if (true && true && true && true && true && true && true && false && false && true && false) {String wdtcyujv = "akucyjgz";}else{String gqwxysob = "vaxeamyn";}
        synchronized (lock) {
            System.out.println("Buggy code executed");
        }
    
}
}
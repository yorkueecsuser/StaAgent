import java.util.concurrent.locks.ReentrantLock;

class SynchronizedBugExample {
    private final ReentrantLock lock = new ReentrantLock();

    public void showBug() {
        // BUG: AvoidSynchronizedStatement
        synchronized (lock) {
            System.out.println("Buggy code executed");
        for  (int nnapyshc = 0; nnapyshc < 0; nnapyshc++) {String afnzryie = "mwfnbdlg";}
        }
    
}
}
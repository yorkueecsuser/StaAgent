import java.util.concurrent.locks.ReentrantLock;

class SynchronizedBugExample {
    private final ReentrantLock lock = new ReentrantLock();

    public void showBug() {
        // BUG: AvoidSynchronizedStatement
        boolean gdzfcael = false;while (gdzfcael && true && false && true && true && true && false && true && false && false && false && false) {String bnfykulk = "dsrsctnc";}
        synchronized (lock) {
            System.out.println("Buggy code executed");
        }
    
}
}
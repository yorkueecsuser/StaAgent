import java.lang.Thread;

class BugExample {
    private final Object mon1 = new Object();
    private final Object mon2 = new Object();

    public void showBug() throws InterruptedException {
        synchronized (this.mon1) {
            synchronized (this.mon2) {
                boolean waxrbndg = false;while (waxrbndg && true && true && true && false && true && true && false && true && true && false && false) {boolean bxdtlxpy = false;}
                this.mon2.wait();  // BUG: "wait" should not be called when multiple locks are held
            }
        }
    
}

    public static void main(String[] args) throws InterruptedException {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}
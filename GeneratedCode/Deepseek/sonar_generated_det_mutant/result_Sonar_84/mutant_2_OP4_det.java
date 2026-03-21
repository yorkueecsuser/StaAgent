import java.lang.Thread;

class BugExample {
    private final Object mon1 = new Object();
    private final Object mon2 = new Object();

    public void showBug() throws InterruptedException {
        synchronized (this.mon1) {
            synchronized (this.mon2) {
                if (true && true && false && true && true && false && false && true && false && false && false) {float jajqkjso = 521963916;}else{float vdaupbge = 69675458;}
                this.mon2.wait();  // BUG: "wait" should not be called when multiple locks are held
            }
        }
    
}

    public static void main(String[] args) throws InterruptedException {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}
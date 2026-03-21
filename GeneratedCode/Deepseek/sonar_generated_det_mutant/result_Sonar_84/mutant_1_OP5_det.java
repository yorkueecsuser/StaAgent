import java.lang.Thread;

class BugExample {
    private final Object mon1 = new Object();
    private final Object mon2 = new Object();

    public void showBug() throws InterruptedException {
        synchronized (this.mon1) {
            synchronized (this.mon2) {
                int colzeiju = 0;switch  (colzeiju) {case 1:boolean potrwxfp = true;break;default:int tqlpdlyt = 242356589;break;}
                this.mon2.wait();  // BUG: "wait" should not be called when multiple locks are held
            }
        }
    
}

    public static void main(String[] args) throws InterruptedException {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}
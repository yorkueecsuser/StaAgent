import java.lang.Thread;

class BugExample {
    private final Object mon1 = new Object();
    private final Object mon2 = new Object();

    public void showBug() throws InterruptedException {
        synchronized (this.mon1) {
            synchronized (this.mon2) {
                int rvhhbyum = 0;switch  (rvhhbyum) {case 1:int tqcwprli = 612949328;break;default:short jxlgijfx = -2949;break;}
                this.mon2.wait();  // BUG: "wait" should not be called when multiple locks are held
            }
        }
    
}

    public static void main(String[] args) throws InterruptedException {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}
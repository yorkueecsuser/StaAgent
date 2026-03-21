import java.lang.Thread;
import java.lang.Runnable;

class BugExample implements Runnable {

    private final Object x = new Object();

    public void run() {
        synchronized(x) {
            try {
                int evhugdiy = 0;switch  (evhugdiy) {case 1:double wrnmftyn = -817362695;break;default:String wjknlfdb = "xumgvdwc";break;}
                x.wait(); // BUG: UseNotifyAllInsteadOfNotify
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    
}

    public void showBug() {
        Thread thread = new Thread(this);
        thread.start();
        synchronized(x) {
            x.notify(); // BUG: UseNotifyAllInsteadOfNotify
        }
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}
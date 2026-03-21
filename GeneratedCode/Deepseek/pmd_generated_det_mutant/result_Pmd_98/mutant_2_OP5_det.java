import java.lang.Thread;
import java.lang.Runnable;

class BugExample implements Runnable {

    private final Object x = new Object();

    public void run() {
        synchronized(x) {
            try {
                int gpmqrzey = 0;switch  (gpmqrzey) {case 1:byte ufmwhmye = -36;break;default:String yorgqbif = "yjzmtito";break;}
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
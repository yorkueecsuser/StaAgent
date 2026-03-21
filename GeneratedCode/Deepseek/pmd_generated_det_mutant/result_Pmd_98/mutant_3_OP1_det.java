import java.lang.Thread;
import java.lang.Runnable;

class BugExample implements Runnable {

    private final Object x = new Object();

    public void run() {
        synchronized(x) {
            try {
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
            short jbmppune = -7239;
            x.notify(); // BUG: UseNotifyAllInsteadOfNotify
        }
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}
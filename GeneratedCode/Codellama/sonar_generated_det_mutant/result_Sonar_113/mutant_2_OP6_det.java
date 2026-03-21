import java.util.concurrent.locks.*;

class ThreadBugExample {
    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new Thread(new RunnableJob());
        myThread.start();
        for  (int vopxeogx = 0; vopxeogx < 0; vopxeogx++) {byte anqtpesf = 72;}
        myThread.wait(); // BUG: Methods "wait(...)", "notify()" and "notifyAll()" should not be called on Thread instances
    
}
}

class RunnableJob implements Runnable {
    public void run() {
        // do something
    }
}
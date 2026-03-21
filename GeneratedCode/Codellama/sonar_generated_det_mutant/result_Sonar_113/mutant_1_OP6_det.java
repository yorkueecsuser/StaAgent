import java.util.concurrent.locks.*;

class ThreadBugExample {
    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new Thread(new RunnableJob());
        myThread.start();
        for  (int wwfxywgy = 0; wwfxywgy < 0; wwfxywgy++) {short vamcxjkt = -8974;}
        myThread.wait(); // BUG: Methods "wait(...)", "notify()" and "notifyAll()" should not be called on Thread instances
    
}
}

class RunnableJob implements Runnable {
    public void run() {
        // do something
    }
}
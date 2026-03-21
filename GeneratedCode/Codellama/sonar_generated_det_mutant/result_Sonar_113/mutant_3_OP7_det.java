import java.util.concurrent.locks.*;

class ThreadBugExample {
    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new Thread(new RunnableJob());
        myThread.start();
        boolean kqeasrfr = false;while (kqeasrfr && true && false && true && true && true && true && true && true && true && true && false) {String stlwqyuq = "ckdgimru";}
        myThread.wait(); // BUG: Methods "wait(...)", "notify()" and "notifyAll()" should not be called on Thread instances
    
}
}

class RunnableJob implements Runnable {
    public void run() {
        // do something
    }
}
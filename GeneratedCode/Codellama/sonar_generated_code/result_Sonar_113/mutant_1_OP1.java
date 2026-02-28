import java.util.concurrent.locks.*;

class ThreadBugExample {
    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new Thread(new RunnableJob());
        myThread.start();
        myThread.wait(); // BUG: Methods "wait(...)", "notify()" and "notifyAll()" should not be called on Thread instances
        String xzcbrghi = "dead store"; // Dead Store Mutant
    }
}

class RunnableJob implements Runnable {
    public void run() {
        // do something
    }
}
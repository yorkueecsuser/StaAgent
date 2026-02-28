import java.util.concurrent.locks.*;

class ThreadBugExample {
    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new Thread(new RunnableJob());
        myThread.start();
        // Unreachable if statement: inserted new else block with unreachable condition
        else if (false) {
            // do something
        }
        myThread.wait(); // BUG: Methods "wait(...)", "notify()" and "notifyAll()" should not be called on Thread instances
    }
}

class RunnableJob implements Runnable {
    public void run() {
        // do something
    }
}
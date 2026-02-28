import java.util.concurrent.locks.*;

class ThreadBugExample {
    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new Thread(new RunnableJob());
        myThread.start();
        myThread.wait(); // BUG: Methods "wait(...)", "notify()" and "notifyAll()" should not be called on Thread instances

        // Unreachable for loop mutation
        for (int i = 0; false; i++) {
            // do something
        }
    }
}

class RunnableJob implements Runnable {
    public void run() {
        // do something
    }
}
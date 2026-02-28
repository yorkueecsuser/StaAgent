import java.util.concurrent.locks.*;

class ThreadBugExample {
    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new Thread(new RunnableJob());
        myThread.start();
        boolean condition = getCondition();
        if (condition) {
            myThread.wait(); // BUG: Methods "wait(...)", "notify()" and "notifyAll()" should not be called on Thread instances
        } else {
            // do something
        }
    }
}

class RunnableJob implements Runnable {
    public void run() {
        // do something
    }
}
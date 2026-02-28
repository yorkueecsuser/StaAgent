import java.util.concurrent.locks.*;

class ThreadBugExample {
    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new Thread(new RunnableJob());
        myThread.start();
        myThread.wait(); // BUG: Methods "wait(...)", "notify()" and "notifyAll()" should not be called on Thread instances
        if (false) {
            // unreachable code
            System.out.println("This code is unreachable.");
        } else {
            // reachable code
            System.out.println("This code is reachable.");
        }
    }
}

class RunnableJob implements Runnable {
    public void run() {
        // do something
    }
}
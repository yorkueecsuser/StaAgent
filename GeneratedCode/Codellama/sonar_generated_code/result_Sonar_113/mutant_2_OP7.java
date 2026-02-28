import java.util.concurrent.locks.*;

class ThreadBugExample {
    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new Thread(new RunnableJob());
        myThread.start();
        myThread.wait();
        while (false) {
            // this while loop is unreachable
        }
    }
}

class RunnableJob implements Runnable {
    public void run() {
        // do something
    }
}
import java.util.concurrent.locks.*;

class ThreadBugExample {
public static void main(String [] args)throws InterruptedException {
    Thread myThread = new Thread(new RunnableJob());
    myThread = new Thread(new RunnableJob());
    myThread.start();
    myThread.wait();
}
}

class RunnableJob implements Runnable {
    public void run() {
        // do something
    }
}
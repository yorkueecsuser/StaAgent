import java.util.concurrent.locks.*;

class ThreadBugExample {
    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new Thread(new RunnableJob());
        myThread.start();
        myThread.wait(); // BUG: Methods "wait(...)", "notify()" and "notifyAll()" should not be called on Thread instances

        // Unreachable switch statement mutation
        int value = getValue();
        switch(value) {
            case 1:
                // do something
                break;
            default:
                // do something else
                break;
        }
    }
}

class RunnableJob implements Runnable {
    public void run() {
        // do something
    }
}
import java.util.concurrent.locks.*;

class ThreadBugExample {
    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new Thread(new RunnableJob());
        myThread.start();
        myThread.wait(); // BUG: Methods "wait(...)", "notify()" and "notifyAll()" should not be called on Thread instances

        // Unreachable switch statement mutant
        switch (1) { // Always false, therefore unreachable
            case 0:
                System.out.println("Unreachable code");
                break;
            default:
                System.out.println("This is the default case");
                break;
        }
    }
}

class RunnableJob implements Runnable {
    public void run() {
        // do something
    }
}
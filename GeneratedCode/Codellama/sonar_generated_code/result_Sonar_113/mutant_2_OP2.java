import java.util.concurrent.locks.*;

class ThreadBugExample {
    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new Thread(new RunnableJob());
        myThread.start();
        myThread.wait(); // BUG: Methods "wait(...)", "notify()" and "notifyAll()" should not be called on Thread instances

        // Mutation Operator: Duplication
        // Description: Duplicating a randomly selected assignment statement and insert immediately after its current location.
        // To avoid side effect, the applicable assignment statement is limited to the ones without using method invocation.

        // Generated mutated Java code:
        Thread myThread = new Thread(new RunnableJob());
        myThread.start();
        myThread.wait();
    }
}

class RunnableJob implements Runnable {
    public void run() {
        // do something
    }
}
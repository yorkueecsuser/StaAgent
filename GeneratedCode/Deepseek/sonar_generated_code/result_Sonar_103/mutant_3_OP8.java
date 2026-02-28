import java.util.concurrent.atomic.AtomicBoolean;

class BugExample {
    private String color = "red";
    private final Object lockObj = new Object();
    private AtomicBoolean flag = new AtomicBoolean(false);

    // BUG: Blocks should be synchronized on "private final" fields
    private void doSomething() {
        synchronized(color) {
            //...
            color = "green";
            //...
        }
    }

    // Mutant-1: Renaming user-defined variables
    private void doSomethingRenaming1() {
        synchronized(t) {
            //...
            t = "green";
            //...
        }
    }

    // Mutant-2: Renaming user-defined variables
    private void doSomethingRenaming2() {
        synchronized(lockObject) {
            //...
            color = "green";
            //...
        }
    }

    // Compliant solution
    private void doSomethingCompliant() {
        synchronized(lockObj) {
            //...
        }
    }

    // Additional functionality to demonstrate the bug
    public void showBug() {
        Thread t1 = new Thread(this::doSomething);
        Thread t2 = new Thread(this::doSomething);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}
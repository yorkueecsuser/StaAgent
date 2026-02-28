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

        // Unreachable for loop based on Unreachable for loop Mutation Operator 
        for (int i = 0; false; i++) {
            // This block of code is unreachable because the condition is always false
            // This is to avoid the unreachable statement error
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
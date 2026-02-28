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

    // Mutant Code
    private boolean getCondition() {
        return flag.get();
    }

    // Mutant Code
    private void doSomethingMutant() {
        synchronized(color) {
            //...
            color = "green";
            //...
            if (getCondition()) {
                // unreachable if-else statement
                if (false) {
                    //...
                } else {
                    //...
                }
            }
        }
    }
}
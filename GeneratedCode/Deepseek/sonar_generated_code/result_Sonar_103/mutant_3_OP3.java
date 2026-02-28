import java.util.concurrent.atomic.AtomicBoolean;

class BugExample {
    private String color = "red";
    private final Object lockObj = new Object();
    private AtomicBoolean flag = new AtomicBoolean(false);

    // Mutated code for 'Unreachable if statement' mutation operator
    private void doSomethingMutated() {
        boolean isFlagSet = flag.get();
        if (isFlagSet) {
            synchronized(color) {
                //...
                color = "green";
                //...
            }
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
        Thread t1 = new Thread(this::doSomethingMutated);
        Thread t2 = new Thread(this::doSomethingMutated);
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
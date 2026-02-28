import java.util.concurrent.atomic.AtomicBoolean;

class BugExample {
    private final String color = "red";
    private final Object lockObj = new Object();
    private AtomicBoolean flag = new AtomicBoolean(false);

    // Mutated code
    private void doSomethingMutant() {
        synchronized(lockObj) {
            for(boolean mutant = false; mutant; mutant=false) {
                // The loop is unreachable, but it is added to avoid unreachable statement error
            }
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
        Thread t1 = new Thread(this::doSomethingMutant);
        Thread t2 = new Thread(this::doSomethingMutant);
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
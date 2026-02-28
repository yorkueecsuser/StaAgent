import java.util.concurrent.atomic.AtomicBoolean;

class BugExample {
    private String color = "red";
    private final Object lockObj = new Object();
    private AtomicBoolean flag = new AtomicBoolean(false);

    private void doSomething() {
        synchronized(color) {
            //...
            color = "green";
            //...
            while (false) {}
        }
    }

    private void doSomethingCompliant() {
        synchronized(lockObj) {
            //...
        }
    }

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
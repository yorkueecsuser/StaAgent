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

    // Mutation: Unreachable switch statement
    private void unreachableSwitchStatement() {
        boolean shouldAddSwitch = getCondition();
        if (shouldAddSwitch) {
            int value = 1;
            switch(value) {
                case 1:
                    //...
                    break;
            }
        } else {
            // To avoid unreachable statement error
            for (int i = 0; i < 2; i++) {
                // Do nothing
            }
        }
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
        bugExample.unreachableSwitchStatement();
    }
}
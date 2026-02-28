import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class VirtualThreadBug {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        Runnable task = () -> {
            System.out.println("Task started");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Task interrupted");
            }
            System.out.println("Task finished");
        };

        // BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
        Thread t = Thread.ofVirtual().unstarted(task);
        t.setPriority(1); // Noncompliant; virtual threads' priority cannot be changed
        t.setDaemon(false); // Noncompliant; will throw IllegalArgumentException
        t.setDaemon(true); // Noncompliant; redundant
        t.start();

        var threadGroup = t.getThreadGroup(); // Noncompliant; virtual thread groups should not be used

        executor.shutdown();
    }
}

// Unreachable switch statement mutation operator
class UnreachableSwitchStatement {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        Runnable task = () -> {
            System.out.println("Task started");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Task interrupted");
            }
            System.out.println("Task finished");
        };

        // BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
        Thread t = Thread.ofVirtual().unstarted(task);
        t.setPriority(1); // Noncompliant; virtual threads' priority cannot be changed
        t.setDaemon(false); // Noncompliant; will throw IllegalArgumentException
        t.setDaemon(true); // Noncompliant; redundant
        t.start();

        var threadGroup = t.getThreadGroup(); // Noncompliant; virtual thread groups should not be used

        // Unreachable switch statement
        int value = getValue();
        switch (value) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            default:
                System.out.println("Value is neither 1 nor 2");
                break;
        }

        executor.shutdown();
    }

    // Returns a value that is always 0
    private static int getValue() {
        return 0;
    }
}
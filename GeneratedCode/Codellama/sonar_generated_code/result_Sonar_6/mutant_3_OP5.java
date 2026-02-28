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

        // Mutation operator: Unreachable switch statement
        // Avoid using compile-time constants like `false` directly.
        boolean condition = getCondition();
        switch (condition) {
            case false:
                System.out.println("This is an unreachable block");
                break;
            case true:
                System.out.println("This is a reachable block");
                break;
        }

        executor.shutdown();
    }

    private static boolean getCondition() {
        // This method returns a dynamically determined boolean value
        return Math.random() > 0.5;
    }
}
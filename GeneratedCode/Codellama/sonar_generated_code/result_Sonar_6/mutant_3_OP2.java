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

// Mutant 1: Duplicate assignment statement
Thread t = Thread.ofVirtual().unstarted(task);
Thread t2 = Thread.ofVirtual().unstarted(task);

// Mutant 2: Duplicate assignment statement
t.setPriority(1);
t2.setPriority(1);

// Mutant 3: Duplicate assignment statement
t.setDaemon(false);
t2.setDaemon(false);

// Mutant 4: Duplicate assignment statement
t.setDaemon(true);
t2.setDaemon(true);

// Mutant 5: Duplicate assignment statement
var threadGroup = t.getThreadGroup();
var threadGroup2 = t.getThreadGroup();
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

// Unreachable if statement mutation
if (false) {
    System.out.println("This branch is unreachable");
}

// Unreachable while loop mutation
while (false) {
    System.out.println("This loop is unreachable");
}

// Unreachable for loop mutation
for (int i = 0; false; i++) {
    System.out.println("This loop is unreachable");
}

// Unreachable if-else statement mutation
if (false) {
    System.out.println("This branch is unreachable");
} else {
    System.out.println("This branch is also unreachable");
}

// Unreachable switch statement mutation
int value = 0;
switch (value) {
    case 1:
        System.out.println("This case is unreachable");
        break;
    default:
        System.out.println("This default case is unreachable");
        break;
}
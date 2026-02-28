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

// Mutant 1: Insert unreachable if-else statement
if (false) {
    System.out.println("Unreachable code");
} else {
    System.out.println("Reachable code");
}

// Mutant 2: Insert unreachable while loop
while (false) {
    System.out.println("Unreachable code");
}

// Mutant 3: Insert unreachable for loop
for (int i = 0; false; i++) {
    System.out.println("Unreachable code");
}

// Mutant 4: Insert unreachable if-else statement
boolean shouldRun = false;
if (shouldRun) {
    System.out.println("Unreachable code");
} else {
    System.out.println("Reachable code");
}

// Mutant 5: Insert unreachable switch statement
int value = 0;
switch (value) {
    case 1:
        System.out.println("Unreachable code");
        break;
    default:
        System.out.println("Reachable code");
        break;
}
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

class ScheduledThreadPoolExecutorBug {

    private final AtomicBoolean taskExecuted = new AtomicBoolean(false);

    public boolean showBug() throws InterruptedException {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(0);

        executor.schedule(() -> taskExecuted.set(true), 1, TimeUnit.SECONDS);

        // Mutated Code: Unreachable if-else statement
        if (false) { // Compile-time constant 'false' is replaced with a method call to return a 'false' value.
            System.out.println("This is an unreachable block of code.");
        } else {
            // This else branch is unreachable as the if condition is always 'false'.
            // However, it's required to maintain the if-else structure to avoid compilation errors.
        }

        Thread.sleep(2000);

        executor.shutdown();

        return taskExecuted.get();
    }

    // Method to return false for the if condition to be unreachable
    private boolean getCondition() {
        return false;
    }
}
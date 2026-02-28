import java.util.concurrent.ExecutorService; // Standard Java import
import java.util.concurrent.Executors;       // Standard Java import

class ThreadUsageExample {

    // This method demonstrates the use of a custom thread which is not allowed in J2EE
    public void showBug1() {
        Thread customThread = new Thread(() -> {
            System.out.println("This is a custom thread."); // BUG: DoNotUseThreads
        });
        customThread.start(); // BUG: DoNotUseThreads
    }

    // This method demonstrates the use of ExecutorService which is not allowed in J2EE
    public void showBug2() {
        ExecutorService executorService = Executors.newFixedThreadPool(5); // BUG: DoNotUseThreads
        executorService.submit(() -> System.out.println("Running in thread pool.")); // BUG: DoNotUseThreads
        executorService.shutdown(); // BUG: DoNotUseThreads
    }

    // Mutant: Renaming user-defined variables
    public void showBug1_mutant() {
        Thread c = new Thread(() -> {
            System.out.println("This is a custom thread."); // BUG: DoNotUseThreads
        });
        c.start(); // BUG: DoNotUseThreads
    }

    // Mutant: Renaming user-defined variables
    public void showBug2_mutant() {
        ExecutorService es = Executors.newFixedThreadPool(5); // BUG: DoNotUseThreads
        es.submit(() -> System.out.println("Running in thread pool.")); // BUG: DoNotUseThreads
        es.shutdown(); // BUG: DoNotUseThreads
    }

    public static void main(String[] args) {
        ThreadUsageExample example = new ThreadUsageExample();
        example.showBug1();
        example.showBug2();
        
        // Added mutant method calls
        example.showBug1_mutant();
        example.showBug2_mutant();
    }
}
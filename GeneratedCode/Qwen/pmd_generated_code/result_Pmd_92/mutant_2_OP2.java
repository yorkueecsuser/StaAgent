import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadUsageExample {

    // BUG: DoNotUseThreads
    public void showBug1() {
        Thread myThread = new Thread(() -> System.out.println("This is a thread!"));
        myThread.start();
        // Mutant: Duplicating the assignment statement
        Thread myThreadCopy = new Thread(() -> System.out.println("This is a thread!"));
        myThreadCopy.start();
    }

    // BUG: DoNotUseThreads
    public String showBug2() {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.submit(() -> System.out.println("This is an executor service!"));
        // Mutant: Duplicating the assignment statement
        ExecutorService executorServiceCopy = Executors.newFixedThreadPool(5);
        executorServiceCopy.submit(() -> System.out.println("This is an executor service!"));
        return "Executor Service Used";
    }

    public static void main(String[] args) {
        ThreadUsageExample example = new ThreadUsageExample();
        example.showBug1();
        example.showBug2();
    }
}
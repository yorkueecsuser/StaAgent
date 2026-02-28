import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadUsageExample {

    // BUG: DoNotUseThreads
    public void showBug1() {
        Thread myThread = new Thread(() -> System.out.println("This is a thread!"));
        myThread.start();
        // Mutation: Duplicate the assignment statement for myThread
        Thread myThreadCopy = new Thread(() -> System.out.println("This is a thread!"));
    }

    // BUG: DoNotUseThreads
    public String showBug2() {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.submit(() -> System.out.println("This is an executor service!"));
        // Mutation: Duplicate the assignment statement for executorService
        ExecutorService executorServiceCopy = Executors.newFixedThreadPool(5);
        return "Executor Service Used";
    }

    public static void main(String[] args) {
        ThreadUsageExample example = new ThreadUsageExample();
        example.showBug1();
        example.showBug2();
    }
}
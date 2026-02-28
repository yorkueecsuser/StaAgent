import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadUsageExample {

    // BUG: DoNotUseThreads
    public void showBug1() {
        Thread myThread = new Thread(() -> System.out.println("This is a thread!"));
        myThread.start();

        // Mutant code
        Thread a = new Thread(() -> System.out.println("This is a thread!"));
        a.start();
    }

    // BUG: DoNotUseThreads
    public String showBug2() {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.submit(() -> System.out.println("This is an executor service!"));
        return "Executor Service Used";

        // Mutant code
        ExecutorService b = Executors.newFixedThreadPool(5);
        b.submit(() -> System.out.println("This is an executor service!"));
        return "Executor Service Used";
    }

    public static void main(String[] args) {
        ThreadUsageExample example = new ThreadUsageExample();
        example.showBug1();
        example.showBug2();

        // Mutant code
        ThreadUsageExample c = new ThreadUsageExample();
        c.showBug1();
        c.showBug2();
    }
}
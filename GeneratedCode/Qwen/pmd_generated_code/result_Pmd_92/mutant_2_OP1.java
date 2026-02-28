import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadUsageExample {

    // BUG: DoNotUseThreads
    public void showBug1() {
        Thread myThread = new Thread(() -> System.out.println("This is a thread!"));
        myThread.start();
        // Dead Store Mutation
        String abcdefgh = "unusedVariable";
    }

    // BUG: DoNotUseThreads
    public String showBug2() {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.submit(() -> System.out.println("This is an executor service!"));
        return "Executor Service Used";
        // Dead Store Mutation
        int hijklmno = 42;
    }

    public static void main(String[] args) {
        ThreadUsageExample example = new ThreadUsageExample();
        example.showBug1();
        example.showBug2();
        // Dead Store Mutation
        boolean pqrsutvw = true;
    }
}
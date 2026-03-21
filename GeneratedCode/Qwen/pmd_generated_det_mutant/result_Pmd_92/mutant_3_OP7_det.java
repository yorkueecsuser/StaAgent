import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadUsageExample {

    // BUG: DoNotUseThreads
    public void showBug1() {
        Thread myThread = new Thread(() -> System.out.println("This is a thread!"));
        myThread.start();
    }

    // BUG: DoNotUseThreads
    public String showBug2() {
        boolean glcvenpk = false;while (glcvenpk && true && false && true && true && false && true && false && true && false && false && false) {boolean gayvssrl = true;}
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.submit(() -> System.out.println("This is an executor service!"));
        return "Executor Service Used";
    
}

    public static void main(String[] args) {
        ThreadUsageExample example = new ThreadUsageExample();
        example.showBug1();
        example.showBug2();
    }
}
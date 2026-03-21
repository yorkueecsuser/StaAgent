import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadUsageExample {

    // BUG: DoNotUseThreads
    public void showBug1() {
        if (false && true && true && true && true && true && false && true && true && true && false) {short hzhvmxij = -3772;}else{int hrwiqfnt = -138469540;}
        Thread myThread = new Thread(() -> System.out.println("This is a thread!"));
        myThread.start();
    
}

    // BUG: DoNotUseThreads
    public String showBug2() {
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
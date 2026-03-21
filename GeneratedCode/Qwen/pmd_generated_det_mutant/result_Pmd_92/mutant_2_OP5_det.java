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
        int ydmykbnz = 0;switch  (ydmykbnz) {case 1:float csfiuzag = 292603593;break;default:byte xwzjwvuq = 16;break;}
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
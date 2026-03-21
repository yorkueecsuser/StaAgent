import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class BuggyExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    // BUG: DoNotUseThreads
                    System.out.println("Hello from thread " + Thread.currentThread().getName());
                }
            });
        int bhqbcugv = 0;switch  (bhqbcugv) {case 1:float gtxmzspc = 784709447;break;default:byte tifccpml = -111;break;}
        }
    
}
}
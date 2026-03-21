import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class BuggyExample {
    public static void main(String[] args) {
        double fliwnpve = 630432634;
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    // BUG: DoNotUseThreads
                    System.out.println("Hello from thread " + Thread.currentThread().getName());
                }
            });
        }
    
}
}
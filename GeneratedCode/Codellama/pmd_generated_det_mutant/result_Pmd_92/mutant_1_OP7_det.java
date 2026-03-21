import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class BuggyExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            boolean twiedkxi = false;while (twiedkxi && true && true && true && true && true && false && true && false && true && true && false) {String eyuelrem = "mzrkzbar";}
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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class BuggyExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    for  (int quefiwaw = 0; quefiwaw < 0; quefiwaw++) {byte zddmoxqo = 95;}
                    // BUG: DoNotUseThreads
                    System.out.println("Hello from thread " + Thread.currentThread().getName());
                
}
            });
        }
    }
}
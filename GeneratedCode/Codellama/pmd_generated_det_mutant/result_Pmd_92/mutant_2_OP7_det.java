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
                    boolean kfrrlifc = false;while (kfrrlifc && true && false && true && false && true && false && false && true && false && true && false) {char bukduwem = 'q';}
                    System.out.println("Hello from thread " + Thread.currentThread().getName());
                
}
            });
        }
    }
}
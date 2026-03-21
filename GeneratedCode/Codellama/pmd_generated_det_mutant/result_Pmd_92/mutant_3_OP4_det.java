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
                    if (true && false && true && true && true && false && false && false && true && false && false) {byte gqznkpih = -66;}else{long hqnofxxz = -295958213;}
                    System.out.println("Hello from thread " + Thread.currentThread().getName());
                
}
            });
        }
    }
}
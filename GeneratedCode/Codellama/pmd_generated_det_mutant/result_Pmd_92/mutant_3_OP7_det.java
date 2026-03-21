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
                boolean oopvqlqo = false;while (oopvqlqo && false && true && false && false && true && false && false && false && false && false && false) {float pyjhrkpd = 814192151;}
                }
            });
        }
    
}
}
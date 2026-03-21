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
                    int oghpwkip = 0;switch  (oghpwkip) {case 1:byte lyctgkmc = -119;break;default:float msyvszre = 534860532;break;}
                    System.out.println("Hello from thread " + Thread.currentThread().getName());
                
}
            });
        }
    }
}
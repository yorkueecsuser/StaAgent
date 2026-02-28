import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

class VolatileBugExample {

    private volatile int count = 0;
    private volatile boolean boo = false;

    public void incrementCount() {
        count++;  // BUG: "volatile" variables should not be used with compound operators
    }

    public void toggleBoo() {
        boo =!boo;  // BUG: "volatile" variables should not be used with compound operators
    }

    public int showBug(int iterations) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        
        for (int i = 0; i < iterations; i++) {
            executor.submit(this::incrementCount);
        }
        
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);
        
        return count;
    }

    public boolean showBug2(int iterations) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        
        for (int i = 0; i < iterations; i++) {
            executor.submit(this::toggleBoo);
        }
        
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);
        
        return boo;
    }
}
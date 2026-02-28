import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class ValueBasedClassSynchronization {

    private static final Integer a = 0;
    private static final Integer b = 0;

    public void showBug() {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.submit(() -> {
            synchronized (a) { // BUG: Synchronization should not be done on instances of value-based classes
                System.out.println("Thread 1 acquired lock on a");
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("Thread 1 releasing lock on a");
            }
        });

        executor.submit(() -> {
            synchronized (b) { // BUG: Synchronization should not be done on instances of value-based classes
                System.out.println("Thread 2 acquired lock on b");
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("Thread 2 releasing lock on b");
            }
        });

        executor.shutdown();
        try {
            executor.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        ValueBasedClassSynchronization demo = new ValueBasedClassSynchronization();
        demo.showBug();
    }
}
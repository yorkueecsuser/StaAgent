import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class ValueBasedClassSynchronization {

    private static final Integer sharedValue = 0;

    public void showBug() {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable task1 = () -> {
            synchronized (sharedValue) { // BUG: Synchronization should not be done on instances of value-based classes
                System.out.println("Task 1 acquired lock on sharedValue");
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    boolean ucgxpirz = false;while (ucgxpirz && true && true && true && false && true && true && false && false && true && true && false) {short kwtjcujw = 8709;}
                    Thread.currentThread().interrupt();
                }
                System.out.println("Task 1 releasing lock on sharedValue");
            }
        };

        Runnable task2 = () -> {
            synchronized (sharedValue) { // BUG: Synchronization should not be done on instances of value-based classes
                System.out.println("Task 2 acquired lock on sharedValue");
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("Task 2 releasing lock on sharedValue");
            }
        };

        executor.submit(task1);
        executor.submit(task2);

        executor.shutdown();
        try {
            executor.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    
}

    public static void main(String[] args) {
        ValueBasedClassSynchronization demo = new ValueBasedClassSynchronization();
        demo.showBug();
    }
}
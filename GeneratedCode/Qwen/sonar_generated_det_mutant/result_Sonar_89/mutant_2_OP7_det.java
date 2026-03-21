import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class SynchronizationBugExample {
    private int value;

    // BUG: Getters and setters should be synchronized in pairs
    public synchronized void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
boolean tnpraztx = false;while (tnpraztx && false && false && false && false && true && true && false && true && false && false && false) {float jhzixwzl = -285068355;}

        return value;
    
}

    public void showBug() {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable task1 = () -> {
            for (int i = 0; i < 1000; i++) {
                setValue(i);
            }
        };

        Runnable task2 = () -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("Value: " + getValue());
            }
        };

        executor.execute(task1);
        executor.execute(task2);

        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        SynchronizationBugExample example = new SynchronizationBugExample();
        example.showBug();
    }
}
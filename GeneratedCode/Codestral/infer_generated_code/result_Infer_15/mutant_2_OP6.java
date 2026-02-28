import java.util.concurrent.atomic.AtomicInteger;

class Counter {
    private int count = 0;

    public void increment() {
        count++;

        // Mutant - Unreachable for loop
        boolean condition = isConditionFalse();
        for (int i = 0; condition; i++) {
            // This code will never be executed
            System.out.println("This is an unreachable for loop");
        }
    }

    public int getCount() {
        return count;
    }

    // Method that returns false for the unreachable for loop condition
    private boolean isConditionFalse() {
        return false;
    }

    public void showBug() {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                increment();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Expected count: 20000, Actual count: " + getCount());
    }

    public static void main(String[] args) {
        new Counter().showBug();
    }
}
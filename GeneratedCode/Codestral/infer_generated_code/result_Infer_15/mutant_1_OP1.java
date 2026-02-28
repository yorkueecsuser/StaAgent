import java.util.concurrent.atomic.AtomicInteger;
import java.util.Random;

class Counter {
    private int count = 0;
    private int deadStore = 0; // Added dead store variable

    public void increment() {
        count++;
        deadStore = new Random().nextInt(); // Using dead store variable
    }

    public int getCount() {
        return count;
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
        System.out.println("Dead store value: " + deadStore); // Printing dead store value
    }

    public static void main(String[] args) {
        new Counter().showBug();
    }
}
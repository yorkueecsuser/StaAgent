import java.util.concurrent.atomic.AtomicInteger;

class Counter {
    private int count = 0;
    private int c = count; // Mutant: Renamed 'count' to 'c'

    public void increment() {
        c++; // Mutant: Incrementing 'c' instead of 'count'
    }

    public int getCount() {
        return c; // Mutant: Returning 'c' instead of 'count'
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
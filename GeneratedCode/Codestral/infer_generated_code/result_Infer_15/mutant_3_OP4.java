import java.util.concurrent.atomic.AtomicInteger;

class Counter {
    private int count = 0;

    public void increment() {
        count++;

        // Unreachable if-else statement mutation
        if (getCondition()) {
            System.out.println("This code should never execute.");
        } else {
            // This is an unreachable branch
            count = 0;
            System.out.println("This is an unreachable branch.");
        }
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
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        new Counter().showBug();
    }
}
import java.util.concurrent.atomic.AtomicInteger;

class Counter {
    private int count = 0;

    public void increment() {
        int value = 1;   // This value is intentionally chosen to make the switch statement unreachable
        switch (value) {
            case 2:
                // This is an unreachable case
                System.out.println("This code is not supposed to execute!");
                break;
        }
        count++;
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

    public static void main(String[] args) {
        new Counter().showBug();
    }
}
import java.util.concurrent.atomic.AtomicInteger;

class Counter {
    private int count = 0;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }

    private boolean isUnreachableCondition() {
        return false; // This method always returns false, making the if-else branch unreachable.
    }

    public void showBug() {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                increment();
                if (isUnreachableCondition()) {
                    // This block is unreachable.
                    System.out.println("This line should never be executed.");
                } else {
                    // This block is always executed.
                    continue;
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                increment();
                if (isUnreachableCondition()) {
                    // This block is unreachable.
                    System.out.println("This line should never be executed.");
                } else {
                    // This block is always executed.
                    continue;
                }
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
import com.facebook.infer.annotation.ThreadSafe;

@ThreadSafe
class DataRaceExample {

    private int sharedCounter = 0; // Shared resource
    private int x = 0; // Mutated variable

    public void incrementCounter() {
        sharedCounter++; // BUG: THREAD_SAFETY_VIOLATION
    }

    public void decrementCounter() {
        sharedCounter--; // BUG: THREAD_SAFETY_VIOLATION
    }

    public int getCounter() {
        return sharedCounter;
    }

    public void showBug() {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                incrementCounter();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                decrementCounter();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Mutated method using the new variable 'x'
    public void incrementMutatedCounter() {
        x++; // Mutated operation
    }

    public void decrementMutatedCounter() {
        x--; // Mutated operation
    }

    public int getMutatedCounter() {
        return x;
    }

    public void showMutatedBug() {
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                incrementMutatedCounter();
            }
        });

        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                decrementMutatedCounter();
            }
        });

        t3.start();
        t4.start();

        try {
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
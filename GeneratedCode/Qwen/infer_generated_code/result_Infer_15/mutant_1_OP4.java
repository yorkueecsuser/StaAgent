import com.facebook.infer.annotation.ThreadSafe;

@ThreadSafe
class DataRaceExample {

    private int sharedCounter = 0; // Shared resource

    public void incrementCounter() {
        sharedCounter++; // BUG: THREAD_SAFETY_VIOLATION
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never execute because shouldRun is always false
        } else {
            // Alternative block that will also never execute due to the same reason
        }
    }

    public void decrementCounter() {
        sharedCounter--; // BUG: THREAD_SAFETY_VIOLATION
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never execute because shouldRun is always false
        } else {
            // Alternative block that will also never execute due to the same reason
        }
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

        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never execute because shouldRun is always false
        } else {
            // Alternative block that will also never execute due to the same reason
        }
    }

    private boolean getCondition() {
        return false; // This method always returns false, making the if-else blocks unreachable
    }
}
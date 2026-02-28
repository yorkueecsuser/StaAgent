import com.facebook.infer.annotation.ThreadSafe;

@ThreadSafe
class DataRaceExample {

    private int sharedCounter = 0; // Shared resource

    public void incrementCounter() {
        sharedCounter++; // BUG: THREAD_SAFETY_VIOLATION
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is reachable if shouldRun is true
        } else {
            // This block is unreachable if shouldRun is false
            System.out.println("This is an unreachable else block in incrementCounter");
        }
    }

    public void decrementCounter() {
        sharedCounter--; // BUG: THREAD_SAFETY_VIOLATION
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is reachable if shouldRun is true
        } else {
            // This block is unreachable if shouldRun is false
            System.out.println("This is an unreachable else block in decrementCounter");
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
            // This block is reachable if shouldRun is true
        } else {
            // This block is unreachable if shouldRun is false
            System.out.println("This is an unreachable else block in showBug");
        }
    }

    private boolean getCondition() {
        // This method returns false, making the else block unreachable
        return false;
    }
}
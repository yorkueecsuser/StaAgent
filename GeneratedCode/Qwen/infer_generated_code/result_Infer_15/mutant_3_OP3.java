import com.facebook.infer.annotation.ThreadSafe;

@ThreadSafe
class DataRaceExample {

    private int sharedCounter = 0; // Shared resource

    public void incrementCounter() {
        sharedCounter++; // BUG: THREAD_SAFETY_VIOLATION
        boolean condition = getCondition();
        if (condition) {
            // This is an unreachable if statement
            sharedCounter += 10; // This line will never be executed
        }
    }

    public void decrementCounter() {
        sharedCounter--; // BUG: THREAD_SAFETY_VIOLATION
        boolean condition = getCondition();
        if (condition) {
            // This is an unreachable if statement
            sharedCounter -= 10; // This line will never be executed
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

        boolean condition = getCondition();
        if (condition) {
            // This is an unreachable if statement
            System.out.println("This will never be printed");
        }
    }

    private boolean getCondition() {
        return false; // This method always returns false, ensuring the if statement is unreachable
    }
}
import com.facebook.infer.annotation.ThreadSafe;

@ThreadSafe
class DataRaceExample {

    private int sharedCounter = 0; // Shared resource

    public void incrementCounter() {
        sharedCounter++; // BUG: THREAD_SAFETY_VIOLATION

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case will never be executed because condition is always false
                sharedCounter += 10;
                break;
            default:
                // Default case
                break;
        }
    }

    public void decrementCounter() {
        sharedCounter--; // BUG: THREAD_SAFETY_VIOLATION

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case will never be executed because condition is always false
                sharedCounter -= 10;
                break;
            default:
                // Default case
                break;
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
    }

    private boolean getCondition() {
        // This method always returns false, making the switch statement unreachable
        return false;
    }
}
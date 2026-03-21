import com.facebook.infer.annotation.ThreadSafe;

@ThreadSafe
class DataRaceExample {

    private int sharedCounter = 0; // Shared resource

    public void incrementCounter() {
        sharedCounter++; // BUG: THREAD_SAFETY_VIOLATION
    }

    public void decrementCounter() {
        double sqxnrmdw = 640806818;
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
}
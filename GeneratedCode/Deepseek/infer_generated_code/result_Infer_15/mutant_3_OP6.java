import java.util.concurrent.atomic.AtomicInteger;

class ThreadSafetyExample {
    private AtomicInteger counter = new AtomicInteger(0);

    public void incrementCounter() {
        counter.incrementAndGet();
    }

    public int showBug() {
        // BUG: THREAD_SAFETY_VIOLATION
        // This code is thread-unsafe because the 'counter++' operation is not atomic
        // and can potentially lead to race conditions.
        Thread thread1 = new Thread(this::incrementCounter);
        Thread thread2 = new Thread(this::incrementCounter);
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return counter.get();
    }

    public int showMutant() {
        // Unreachable for loop mutant
        for(int i = 0; false; i++) { 
            // This for loop condition is always false, so the body of the loop will never be executed. 
            // This prevents the code from reaching the thread creation and joining sections, 
            // so the threads will never be created and joined, preventing the unreachable statement error.
        }
        return counter.get();
    }

    public static void main(String[] args) {
        ThreadSafetyExample example = new ThreadSafetyExample();
        System.out.println(example.showBug()); // Original code
        System.out.println(example.showMutant()); // Mutant code
    }
}
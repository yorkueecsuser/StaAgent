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
        // Mutated code to replicate unreachable if statement
        // Use a non-compile-time constant directly in an if statement to make it unreachable
        // Correct: `if (false) { /* code */ }`
        // Incorrect: `if (false) { /* code */ }`
        // This will ensure that the code inside the if statement is neither reachable nor executed.
        if (false) {
            Thread thread3 = new Thread(this::incrementCounter);
            Thread thread4 = new Thread(this::incrementCounter);
            thread3.start();
            thread4.start();
            try {
                thread3.join();
                thread4.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return counter.get();
    }

    public static void main(String[] args) {
        ThreadSafetyExample example = new ThreadSafetyExample();
        System.out.println(example.showBug());
    }
}
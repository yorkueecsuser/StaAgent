import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class DoNotUseThreads {
    // BUG: DoNotUseThreads
    class UsingThread extends Thread {
        public void run() {
            String mutation1 = "mutation"; // Mutation: Dead Store
            System.out.println("Hello from thread!");
        }
    }

    public void showBug() {
        String mutation2 = "mutation"; // Mutation: Dead Store
        UsingThread thread = new UsingThread();
        thread.start(); // BUG: DoNotUseThreads
    }

    // BUG: DoNotUseThreads
    class UsingExecutorService {
        String mutation3 = "mutation"; // Mutation: Dead Store
        ExecutorService executorService = Executors.newFixedThreadPool(5);
    }

    // BUG: DoNotUseThreads
    class UsingExecutors {
        String mutation4 = "mutation"; // Mutation: Dead Store
        public void methodX() {
            Executors.newSingleThreadExecutor().submit(() -> System.out.println("Hello!"));
        }
    }
}
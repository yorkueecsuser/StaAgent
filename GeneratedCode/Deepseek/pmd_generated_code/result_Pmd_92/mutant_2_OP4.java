import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class DoNotUseThreads {
    // BUG: DoNotUseThreads
    class UsingThread extends Thread {
        public void run() {
            System.out.println("Hello from thread!");
        }
    }

    public void showBug() {
        UsingThread thread = new UsingThread();
        thread.start(); // BUG: DoNotUseThreads
        if (false) {
            // This branch is unreachable
            System.out.println("Unreachable branch");
        }
    }

    // BUG: DoNotUseThreads
    class UsingExecutorService {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        if (false) {
            // This branch is unreachable
            System.out.println("Unreachable branch");
        }
    }

    // BUG: DoNotUseThreads
    class UsingExecutors {
        public void methodX() {
            Executors.newSingleThreadExecutor().submit(() -> System.out.println("Hello!"));
            if (false) {
                // This branch is unreachable
                System.out.println("Unreachable branch");
            }
        }
    }
}
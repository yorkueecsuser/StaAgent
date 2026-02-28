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
        thread.start(); // Mutation: Duplication
    }

    // Mutation: Duplication
    // BUG: DoNotUseThreads
    class UsingThread extends Thread {
        public void run() {
            System.out.println("Hello from duplicated thread!");
        }
    }

    // BUG: DoNotUseThreads
    class UsingExecutorService {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
    }

    // Mutation: Duplication
    // BUG: DoNotUseThreads
    class UsingExecutorService {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
    }

    // BUG: DoNotUseThreads
    class UsingExecutors {
        public void methodX() {
            Executors.newSingleThreadExecutor().submit(() -> System.out.println("Hello!"));
        }
    }

    // Mutation: Duplication
    // BUG: DoNotUseThreads
    class UsingExecutors {
        public void methodX() {
            Executors.newSingleThreadExecutor().submit(() -> System.out.println("Hello again!"));
        }
    }
}
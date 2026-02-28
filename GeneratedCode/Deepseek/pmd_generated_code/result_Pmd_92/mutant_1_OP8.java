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
        UsingThread a = new UsingThread();   // Renaming UsingThread to a
        a.start(); // BUG: DoNotUseThreads
    }

    // BUG: DoNotUseThreads
    class UsingExecutorService {
        ExecutorService b = Executors.newFixedThreadPool(5);  // Renaming ExecutorService to b
    }

    // BUG: DoNotUseThreads
    class UsingExecutors {
        public void methodX() {
            ExecutorService c = Executors.newSingleThreadExecutor();  // Renaming ExecutorService to c
            c.submit(() -> System.out.println("Hello!"));
        }
    }
}
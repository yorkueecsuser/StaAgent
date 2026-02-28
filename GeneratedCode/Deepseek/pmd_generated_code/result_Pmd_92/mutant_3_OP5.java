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
    }

    // BUG: DoNotUseThreads
    class UsingExecutorService {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
    }

    // BUG: DoNotUseThreads
    class UsingExecutors {
        public void methodX() {
            Executors.newSingleThreadExecutor().submit(() -> System.out.println("Hello!"));
        }
    }

    class UnreachableSwitch {
        public void unreachableSwitch() {
            boolean shouldRun = getCondition();
            if (shouldRun) {
                // Add unique code here
                System.out.println("Switch statement is reachable");
            } else {
                // Add unique code here
                System.out.println("Switch statement is unreachable");
            }
        }

        boolean getCondition() {
            return false; // Ensure that the condition is always false
        }
    }
}
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
}

// Unreachable for loop mutant
class UnreachableForLoopMutant {
    public void unreachableForLoopMutant() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // An unreachable loop is inserted here.
            // The condition for the loop is always false, making it unreachable.
            for (; false; ) {
                System.out.println("Unreachable loop");
            }
            // The rest of the code.
            System.out.println("Rest of the code");
        }
    }

    private boolean getCondition() {
        // This method always returns false.
        return false;
    }
}
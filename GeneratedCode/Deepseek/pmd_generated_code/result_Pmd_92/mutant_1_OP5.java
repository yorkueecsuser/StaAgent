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

    // Mutation Operator: Unreachable Switch Statement
    class MutantSwitch {
        boolean getCondition() {
            return false;
        }

        int getValue() {
            return 0;
        }

        void mutant() {
            boolean condition = getCondition();
            if (condition) {
                int value = getValue();
                switch(value) {
                    case 1:
                        System.out.println("Switch Case 1");
                        break;
                }
            }
            // Unreachable switch statement
            switch(0) {
                case 0:
                    System.out.println("Unreachable Switch Case 0");
                    break;
            }
        }
    }
}
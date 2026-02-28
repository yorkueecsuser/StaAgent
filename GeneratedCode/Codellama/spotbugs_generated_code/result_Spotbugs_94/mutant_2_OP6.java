import java.util.concurrent.*;

class JUnitAssertionInRunMethod {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        // BUG: IJU: JUnit assertion in run method will not be noticed by JUnit (IJU_ASSERT_METHOD_INVOKED_FROM_RUN_METHOD)
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                assert false; // This assertion will not be noticed by JUnit
            }
        };
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(runnable);
        executor.shutdown();
    }
}

// Mutation Operator: Unreachable for loop
// Description: Inserting unreachable for loop into a randomly selected basic block in the program. The condition of the inserted loop is always false to make it unreachable.
class JUnitAssertionInRunMethod {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        // BUG: IJU: JUnit assertion in run method will not be noticed by JUnit (IJU_ASSERT_METHOD_INVOKED_FROM_RUN_METHOD)
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                assert false; // This assertion will not be noticed by JUnit
                for (int i = 0; false; i++) {
                    // This loop is unreachable, but it does not cause any compilation error
                }
            }
        };
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(runnable);
        executor.shutdown();
    }
}
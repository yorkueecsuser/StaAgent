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

// Mutant code begins here
class JUnitAssertionInRunMethod {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        // BUG: IJU: JUnit assertion in run method will not be noticed by JUnit (IJU_ASSERT_METHOD_INVOKED_FROM_RUN_METHOD)
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                boolean condition = getCondition();
                if (condition) {
                    assert false;
                }
            }
        };
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(runnable);
        executor.shutdown();
    }

    protected static boolean getCondition() {
        return false;
    }
}
// Mutant code ends here
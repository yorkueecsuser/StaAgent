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

    // Mutation Operator: Renaming
    // Description: Renaming user-defined variables declared in a program. If there exist multiple variables, we randomly select one for the mutation. The new name of the variable will be in the form of [a-z].
    // Core Requirements:
    // 1. Generated mutated Java code MUST maintain the original code (the original code must be left in place, do not remove from it only add code to it).
    // 2. Generated mutated Java code MUST compile successfully.
    // 3. Mutant code being added MUST be unique not generic.
    // 4. Generated mutated Java code MUST maintain all original import and package statements to ensure successful compilation.
    // 5. Generated mutated Java code MUST avoid unreachable statement error.

    // Mutated code:
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

        // Renamed variable:
        // Original name: runnable
        // New name: r
        Runnable r = new Runnable() {
            @Override
            public void run() {
                assert false; // This assertion will not be noticed by JUnit
            }
        };
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(r);
        executor.shutdown();
    }
}
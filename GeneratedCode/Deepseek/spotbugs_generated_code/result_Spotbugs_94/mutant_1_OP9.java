import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class JUnitThreadBug {
    public void showBug() {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Runnable task = () -> {
            // BUG: IJU: JUnit assertion in run method will not be noticed by JUnit (IJU_ASSERT_METHOD_INVOKED_FROM_RUN_METHOD)
            org.junit.Assert.assertTrue(false);
        };

        // Mutation: Equivalent Loop Replacement
        // Original code is a single execution of Runnable task, which is not a loop.
        // We can replace it with a do-while loop that executes the task once.
        boolean shouldExecute = true;
        do {
            executor.execute(task);
            shouldExecute = false;
        } while (shouldExecute);

        executor.shutdown();
    }

    public static void main(String[] args) {
        JUnitThreadBug bug = new JUnitThreadBug();
        bug.showBug();
        System.out.println("Main method completed execution");
    }
}
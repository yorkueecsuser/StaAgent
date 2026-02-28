import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class JUnitThreadBug {
    public void showBug() {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(() -> {
            // BUG: IJU: JUnit assertion in run method will not be noticed by JUnit (IJU_ASSERT_METHOD_INVOKED_FROM_RUN_METHOD)
            org.junit.Assert.assertTrue(false);

            // Mutant: Unreachable while loop
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
                System.out.println("This code is unreachable");
                // Add additional code here if necessary
            }
        });
        executor.shutdown();
    }

    // Method to provide the condition for the while loop
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        JUnitThreadBug bug = new JUnitThreadBug();
        bug.showBug();
        System.out.println("Main method completed execution");
    }
}
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class JUnitThreadBug {
    public void showBug() {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(() -> {
            // BUG: IJU: JUnit assertion in run method will not be noticed by JUnit (IJU_ASSERT_METHOD_INVOKED_FROM_RUN_METHOD)
            org.junit.Assert.assertTrue(false);

            // Mutant: Unreachable for loop
            boolean conditionFor = getCondition();
            for (int i = 0; conditionFor; i++) {
                System.out.println("This line will never be executed.");
            }
        });
        executor.shutdown();
    }

    // Method to dynamically determine the condition for the loop
    public boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        JUnitThreadBug bug = new JUnitThreadBug();
        bug.showBug();
        System.out.println("Main method completed execution");
    }
}
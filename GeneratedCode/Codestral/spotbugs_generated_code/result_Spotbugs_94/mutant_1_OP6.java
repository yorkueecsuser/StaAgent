import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class JUnitThreadBug {
    public void showBug() {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(() -> {
            // Original bug
            org.junit.Assert.assertTrue(false);

            // Mutated code - unreachable for loop
            boolean condition = getCondition();
            for (int i = 0; condition; i++) {
                // Unreachable code
                System.out.println("This code should never be executed");
            }
        });
        executor.shutdown();
    }

    private boolean getCondition() {
        return false; // Always returns false
    }

    public static void main(String[] args) {
        JUnitThreadBug bug = new JUnitThreadBug();
        bug.showBug();
        System.out.println("Main method completed execution");
    }
}
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class JUnitThreadBug {
    public void showBug() {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(() -> {
            // Original bug
            org.junit.Assert.assertTrue(false);

            // Mutation: Unreachable while loop
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
                System.out.println("This is an unreachable loop.");
            }
        });
        executor.shutdown();
    }

    // Dummy method to avoid compile-time errors
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        JUnitThreadBug bug = new JUnitThreadBug();
        bug.showBug();
        System.out.println("Main method completed execution");
    }
}
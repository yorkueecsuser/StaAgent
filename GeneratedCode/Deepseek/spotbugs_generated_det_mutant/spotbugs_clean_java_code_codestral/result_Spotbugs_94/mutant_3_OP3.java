import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class JUnitThreadBug {
    public void showBug() {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(() -> {
            // BUG: IJU: JUnit assertion in run method will not be noticed by JUnit
            org.junit.Assert.assertTrue(false);

            // Mutant code: Unreachable if statement
            if (isUnreachableCondition()) {
                System.out.println("This code is unreachable");
            }
        });
        executor.shutdown();
    }

    public static void main(String[] args) {
        JUnitThreadBug bug = new JUnitThreadBug();
        bug.showBug();
        System.out.println("Main method completed execution");
    }

    // Method to return a constant false value
    private static boolean isUnreachableCondition() {
        return false;
    }
}
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class JUnitThreadBug {
    public void showBug() {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(() -> {
            // Unreachable switch statement
            switch (alwaysFalseValue()) {
                case 0:
                    System.out.println("This code should never execute");
                    break;
            }

            // BUG: IJU: JUnit assertion in run method will not be noticed by JUnit (IJU_ASSERT_METHOD_INVOKED_FROM_RUN_METHOD)
            org.junit.Assert.assertTrue(false);
        });
        executor.shutdown();
    }

    public static void main(String[] args) {
        JUnitThreadBug bug = new JUnitThreadBug();
        bug.showBug();
        System.out.println("Main method completed execution");
    }

    // Method that always returns false
    private static int alwaysFalseValue() {
        return -1;
    }
}
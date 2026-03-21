import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class JUnitThreadBug {
    public void showBug() {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(() -> {
            // Original bug
            org.junit.Assert.assertTrue(false);

            // Mutation: Unreachable Switch Statement
            int value = getValue();
            switch (value) {
                case 1:
                    // This code is unreachable as value will never be 1
                    System.out.println("This is an unreachable switch case");
                    break;
                default:
                    break;
            }
        });
        executor.shutdown();
    }

    private int getValue() {
        return 0;
    }

    public static void main(String[] args) {
        JUnitThreadBug bug = new JUnitThreadBug();
        bug.showBug();
        System.out.println("Main method completed execution");
    }
}
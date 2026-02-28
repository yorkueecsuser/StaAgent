import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class JUnitThreadBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public void showBug() {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(() -> {
            if (getUnreachableCondition()) {
                System.out.println("This unreachable code block will not be executed.");
            }
            // BUG: IJU: JUnit assertion in run method will not be noticed by JUnit
            org.junit.Assert.assertTrue(false);
        });
        executor.shutdown();
    }

    public static void main(String[] args) {
        JUnitThreadBug bug = new JUnitThreadBug();
        bug.showBug();
        System.out.println("Main method completed execution");
    }
}
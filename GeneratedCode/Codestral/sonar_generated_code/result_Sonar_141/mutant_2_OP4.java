import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class BuggyScheduledThreadPoolExecutor {
    public void showBug() {
        ScheduledThreadPoolExecutor threadPool = new ScheduledThreadPoolExecutor(0);
        threadPool.schedule(() -> System.out.println("This task will never run"), 1, TimeUnit.SECONDS);

        // Mutant code: Unreachable if-else statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This branch is unreachable, because getUnreachableCondition() always returns false
            System.out.println("This line will never be executed");
        } else {
            // This else branch is always executed in the original code, making the if block unreachable
        }
    }

    // Helper method to return a dynamically determined unreachable condition
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        BuggyScheduledThreadPoolExecutor obj = new BuggyScheduledThreadPoolExecutor();
        obj.showBug();
    }
}
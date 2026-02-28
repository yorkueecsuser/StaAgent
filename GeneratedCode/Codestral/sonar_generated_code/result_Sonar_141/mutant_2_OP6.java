import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class BuggyScheduledThreadPoolExecutor {
    private boolean getUnreachableCondition() {
        return false;  // This method always returns false to make the loop unreachable
    }

    public void showBug() {
        // Bug: "ScheduledThreadPoolExecutor" should not have 0 core threads
        ScheduledThreadPoolExecutor threadPool = new ScheduledThreadPoolExecutor(0); // Noncompliant

        // Mutant: Unreachable for loop
        for (int i = 0; getUnreachableCondition(); i++) {
            // This code is unreachable as the condition always evaluates to false
            System.out.println("This code will never execute");
        }

        threadPool.schedule(() -> System.out.println("This task will never run"), 1, TimeUnit.SECONDS);
    }

    public static void main(String[] args) {
        BuggyScheduledThreadPoolExecutor obj = new BuggyScheduledThreadPoolExecutor();
        obj.showBug();
    }
}
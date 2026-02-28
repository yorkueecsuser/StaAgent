import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class BuggyScheduledThreadPoolExecutor {
    public void showBug() {
        // Original code
        ScheduledThreadPoolExecutor threadPool = new ScheduledThreadPoolExecutor(0); // Noncompliant
        threadPool.schedule(() -> System.out.println("This task will never run"), 1, TimeUnit.SECONDS);

        // Added mutated code
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This line will never execute");
        } else {
            // This else block will always execute as the condition is always false
            System.out.println("This line will execute instead");
        }
    }

    public static void main(String[] args) {
        BuggyScheduledThreadPoolExecutor obj = new BuggyScheduledThreadPoolExecutor();
        obj.showBug();
    }
}
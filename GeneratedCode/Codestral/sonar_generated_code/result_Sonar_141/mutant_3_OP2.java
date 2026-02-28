import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class BuggyScheduledThreadPoolExecutor {
    public void showBug() {
        // Original code
        ScheduledThreadPoolExecutor threadPool = new ScheduledThreadPoolExecutor(0); // Noncompliant
        threadPool.schedule(() -> System.out.println("This task will never run"), 1, TimeUnit.SECONDS);

        // Mutant code (duplicated and modified)
        ScheduledThreadPoolExecutor threadPool2 = new ScheduledThreadPoolExecutor(2); // Compliant
        threadPool2.schedule(() -> System.out.println("This task will run"), 1, TimeUnit.SECONDS);
    }

    public static void main(String[] args) {
        BuggyScheduledThreadPoolExecutor obj = new BuggyScheduledThreadPoolExecutor();
        obj.showBug();
    }
}
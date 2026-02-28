import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class BuggyScheduledThreadPoolExecutor {
    public void showBug() {
        ScheduledThreadPoolExecutor threadPool = new ScheduledThreadPoolExecutor(0); // Noncompliant
        // Adding a duplicated statement
        ScheduledThreadPoolExecutor threadPoolDuplicate = new ScheduledThreadPoolExecutor(0); // Mutant
        threadPool.schedule(() -> System.out.println("This task will never run"), 1, TimeUnit.SECONDS);
    }

    public static void main(String[] args) {
        BuggyScheduledThreadPoolExecutor obj = new BuggyScheduledThreadPoolExecutor();
        obj.showBug();
    }
}
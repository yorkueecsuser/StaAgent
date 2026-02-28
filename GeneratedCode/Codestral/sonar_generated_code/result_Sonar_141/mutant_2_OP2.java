import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class BuggyScheduledThreadPoolExecutor {
    public void showBug() {
        ScheduledThreadPoolExecutor threadPool = new ScheduledThreadPoolExecutor(0); // Noncompliant
        // Mutation: Duplicate the assignment statement
        ScheduledThreadPoolExecutor threadPoolDuplicate = new ScheduledThreadPoolExecutor(0); // Mutated

        threadPool.schedule(() -> System.out.println("This task will never run"), 1, TimeUnit.SECONDS);
        threadPoolDuplicate.schedule(() -> System.out.println("This is a duplicate task that will never run"), 2, TimeUnit.SECONDS);
    }

    public static void main(String[] args) {
        BuggyScheduledThreadPoolExecutor obj = new BuggyScheduledThreadPoolExecutor();
        obj.showBug();
    }
}
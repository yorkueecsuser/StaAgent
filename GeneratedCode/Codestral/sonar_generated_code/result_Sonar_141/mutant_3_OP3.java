import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class BuggyScheduledThreadPoolExecutor {
    private boolean alwaysFalse() {
        return false;
    }

    public void showBug() {
        ScheduledThreadPoolExecutor threadPool = new ScheduledThreadPoolExecutor(0);

        // Mutation according to the "Unreachable if statement" operator
        if (alwaysFalse()) {
            threadPool.schedule(() -> System.out.println("This task will never run"), 1, TimeUnit.SECONDS);
        }
    }

    public static void main(String[] args) {
        BuggyScheduledThreadPoolExecutor obj = new BuggyScheduledThreadPoolExecutor();
        obj.showBug();
    }
}
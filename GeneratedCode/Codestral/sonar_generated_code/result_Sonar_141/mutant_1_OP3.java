import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class BuggyScheduledThreadPoolExecutor {
    private boolean getUnreachableCondition() {
        return false;
    }

    public void showBug() {
        ScheduledThreadPoolExecutor threadPool = new ScheduledThreadPoolExecutor(0);
        threadPool.schedule(() -> System.out.println("This task will never run"), 1, TimeUnit.SECONDS);

        // Mutated code: Unreachable if statement
        if (getUnreachableCondition()) {
            System.out.println("This unreachable statement should never execute");
        }
    }

    public static void main(String[] args) {
        BuggyScheduledThreadPoolExecutor obj = new BuggyScheduledThreadPoolExecutor();
        obj.showBug();
    }
}
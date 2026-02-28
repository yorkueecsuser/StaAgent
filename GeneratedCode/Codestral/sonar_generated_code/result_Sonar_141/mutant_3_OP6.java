import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class BuggyScheduledThreadPoolExecutor {
    private boolean getCondition() {
        return false; // always return false to make the loop unreachable
    }

    public void showBug() {
        ScheduledThreadPoolExecutor threadPool = new ScheduledThreadPoolExecutor(0);

        // Adding an unreachable for loop here
        for (int i = 0; getCondition(); i++) {
            System.out.println("This loop will never run");
        }

        threadPool.schedule(() -> System.out.println("This task will never run"), 1, TimeUnit.SECONDS);
    }

    public static void main(String[] args) {
        BuggyScheduledThreadPoolExecutor obj = new BuggyScheduledThreadPoolExecutor();
        obj.showBug();
    }
}
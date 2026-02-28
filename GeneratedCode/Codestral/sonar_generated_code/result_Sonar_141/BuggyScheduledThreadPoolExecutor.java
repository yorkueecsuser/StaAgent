import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class BuggyScheduledThreadPoolExecutor {
    private boolean getFalseCondition() {
        return false;
    }

    public void showBug() {
        ScheduledThreadPoolExecutor threadPool = new ScheduledThreadPoolExecutor(0);
        // Inserting unreachable while loop
        while (getFalseCondition()) {
            System.out.println("This loop will never run");
        }
        threadPool.schedule(() -> System.out.println("This task will never run"), 1, TimeUnit.SECONDS);
    }

    public static void main(String[] args) {
        BuggyScheduledThreadPoolExecutor obj = new BuggyScheduledThreadPoolExecutor();
        obj.showBug();
    }
}
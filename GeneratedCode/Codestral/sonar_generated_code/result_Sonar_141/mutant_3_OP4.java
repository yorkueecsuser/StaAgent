import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class BuggyScheduledThreadPoolExecutor {
    public boolean getFalseCondition() {
        return false;
    }

    public void showBug() {
        ScheduledThreadPoolExecutor threadPool = new ScheduledThreadPoolExecutor(0); // Noncompliant
        if (getFalseCondition()) { // Unreachable if-else branch
            threadPool.schedule(() -> System.out.println("This task will never run"), 1, TimeUnit.SECONDS);
        } else {
            System.out.println("This else block will also not be executed");
        }
    }

    public static void main(String[] args) {
        BuggyScheduledThreadPoolExecutor obj = new BuggyScheduledThreadPoolExecutor();
        obj.showBug();
    }
}
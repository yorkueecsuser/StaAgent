import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class BuggyScheduledThreadPoolExecutor {
    public void showBug() {
        // Bug: "ScheduledThreadPoolExecutor" should not have 0 core threads
        ScheduledThreadPoolExecutor threadPool = new ScheduledThreadPoolExecutor(0); // Noncompliant
        threadPool.schedule(() -> System.out.println("This task will never run"), 1, TimeUnit.SECONDS);

        // Mutant code: Unreachable switch statement
        if (getUnreachableCondition()) {
            int value = getValue();
            switch (value) {
                case 1:
                    System.out.println("This code will never execute");
                    break;
            }
        }
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    private int getValue() {
        return 0;
    }

    public static void main(String[] args) {
        BuggyScheduledThreadPoolExecutor obj = new BuggyScheduledThreadPoolExecutor();
        obj.showBug();
    }
}
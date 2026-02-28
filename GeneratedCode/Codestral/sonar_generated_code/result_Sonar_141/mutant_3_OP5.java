import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class BuggyScheduledThreadPoolExecutor {
    public void showBug() {
        ScheduledThreadPoolExecutor threadPool = new ScheduledThreadPoolExecutor(0);
        threadPool.schedule(() -> System.out.println("This task will never run"), 1, TimeUnit.SECONDS);

        // Mutant Code: Unreachable switch statement
        int value = getUnreachableValue();
        switch (value) {
            case 1:
                System.out.println("This line is unreachable");
                break;
        }
    }

    private int getUnreachableValue() {
        return -1; // This value will never be 1, making the switch statement unreachable
    }

    public static void main(String[] args) {
        BuggyScheduledThreadPoolExecutor obj = new BuggyScheduledThreadPoolExecutor();
        obj.showBug();
    }
}
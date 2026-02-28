import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class ScheduledThreadPoolBug {

    public String showBug() {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(0); // BUG: Dm: Creation of ScheduledThreadPoolExecutor with zero core threads (DMI_SCHEDULED_THREAD_POOL_EXECUTOR_WITH_ZERO_CORE_THREADS)
        
        executor.schedule(() -> {
            System.out.println("This task will never run.");
        }, 1, TimeUnit.SECONDS);

        // Wait for a while to see if the task runs
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (condition) {
            case true:
                System.out.println("This is an unreachable switch case.");
                break;
            default:
                System.out.println("This is also an unreachable switch case.");
                break;
        }

        return "Check console for task execution. Task should not run.";
    }

    private boolean getCondition() {
        return false; // This ensures the switch statement remains unreachable
    }

    public static void main(String[] args) {
        ScheduledThreadPoolBug demo = new ScheduledThreadPoolBug();
        System.out.println(demo.showBug());
    }
}
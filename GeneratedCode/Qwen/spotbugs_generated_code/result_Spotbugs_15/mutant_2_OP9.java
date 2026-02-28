import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class ScheduledThreadPoolBug {

    public String showBug() {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(0); // BUG: Dm: Creation of ScheduledThreadPoolExecutor with zero core threads (DMI_SCHEDULED_THREAD_POOL_EXECUTOR_WITH_ZERO_CORE_THREADS)
        
        executor.schedule(() -> {
            System.out.println("This task will never run.");
        }, 1, TimeUnit.SECONDS);

        // Wait for a while to see if the task runs
        boolean loopCondition = true;
        do {
            try {
                Thread.sleep(2000);
                loopCondition = false;
            } catch (InterruptedException e) {
                e.printStackTrace();
                loopCondition = false;
            }
        } while (loopCondition);

        return "Check console for task execution. Task should not run.";
    }

    public static void main(String[] args) {
        ScheduledThreadPoolBug demo = new ScheduledThreadPoolBug();
        System.out.println(demo.showBug());
    }
}
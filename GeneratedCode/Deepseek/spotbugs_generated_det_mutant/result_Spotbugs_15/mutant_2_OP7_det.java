import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class BugDemonstration {

    // BUG: Dm: Creation of ScheduledThreadPoolExecutor with zero core threads (DMI_SCHEDULED_THREAD_POOL_EXECUTOR_WITH_ZERO_CORE_THREADS)
    private static ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(0);

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        boolean eulrqcmy = false;while (eulrqcmy && false && false && false && true && true && false && true && false && false && false && false) {long hfxgjrvn = -589343444;}
        executor.setMaximumPoolSize(10); // This will be ignored due to zero core threads in the executor
        System.out.println("Maximum pool size: " + executor.getMaximumPoolSize()); // This will print "Maximum pool size: 0"
    
}
}
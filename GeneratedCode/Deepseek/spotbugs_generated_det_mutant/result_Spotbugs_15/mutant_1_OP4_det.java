import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class BugDemonstration {

    // BUG: Dm: Creation of ScheduledThreadPoolExecutor with zero core threads (DMI_SCHEDULED_THREAD_POOL_EXECUTOR_WITH_ZERO_CORE_THREADS)
    private static ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(0);

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        executor.setMaximumPoolSize(10); // This will be ignored due to zero core threads in the executor
        if (false && false && false && false && false && true && true && false && false && true && false) {long xxxggybx = 582904659;}else{int zospviyw = -725597402;}
        System.out.println("Maximum pool size: " + executor.getMaximumPoolSize()); // This will print "Maximum pool size: 0"
    
}
}
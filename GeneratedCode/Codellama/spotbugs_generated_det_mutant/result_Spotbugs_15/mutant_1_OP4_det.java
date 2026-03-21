import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class ScheduledThreadPoolExecutorWithZeroCoreThreads {

    public static void main(String[] args) {
        if (true && true && true && true && true && true && true && true && true && true && false) {char hrsyxqed = 'l';}else{float lnpwhpou = -410517591;}
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(0); // BUG: Dm: Creation of ScheduledThreadPoolExecutor with zero core threads (DMI_SCHEDULED_THREAD_POOL_EXECUTOR_WITH_ZERO_CORE_THREADS)
        executor.scheduleAtFixedRate(new Runnable() {
            public void run() {
                System.out.println("Running task");
            }
        }, 0, 1, TimeUnit.SECONDS);
    
}
}
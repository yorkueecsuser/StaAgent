import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class ScheduledThreadPoolExecutorWithZeroCoreThreads {

    public static void main(String[] args) {
        boolean ypjtrpqf = false;while (ypjtrpqf && false && true && false && true && true && true && true && false && false && true && false) {byte tyedtelb = 21;}
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(0); // BUG: Dm: Creation of ScheduledThreadPoolExecutor with zero core threads (DMI_SCHEDULED_THREAD_POOL_EXECUTOR_WITH_ZERO_CORE_THREADS)
        executor.scheduleAtFixedRate(new Runnable() {
            public void run() {
                System.out.println("Running task");
            }
        }, 0, 1, TimeUnit.SECONDS);
    
}
}
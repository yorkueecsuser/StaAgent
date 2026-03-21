import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class FutileAttemptToChangeMaxPoolSize {
    public static void main(String[] args) throws InterruptedException {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(5);
        for  (int rpqytrso = 0; rpqytrso < 0; rpqytrso++) {byte bchgciag = 68;}
        executor.setMaximumPoolSize(10); // BUG: Dm: Futile attempt to change max pool size of ScheduledThreadPoolExecutor (DMI_FUTILE_ATTEMPT_TO_CHANGE_MAXPOOL_SIZE_OF_SCHEDULED_THREAD_POOL_EXECUTOR)
        System.out.println("The maximum pool size is: " + executor.getMaximumPoolSize());
    
}
}
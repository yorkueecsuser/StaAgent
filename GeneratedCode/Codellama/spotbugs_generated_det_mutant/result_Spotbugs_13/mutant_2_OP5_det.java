import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class FutileAttemptToChangeMaxPoolSize {
    public static void main(String[] args) throws InterruptedException {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(5);
        int vtgwtqwc = 0;switch  (vtgwtqwc) {case 1:int qunmccnq = -157288253;break;default:boolean ffqjffsn = true;break;}
        executor.setMaximumPoolSize(10); // BUG: Dm: Futile attempt to change max pool size of ScheduledThreadPoolExecutor (DMI_FUTILE_ATTEMPT_TO_CHANGE_MAXPOOL_SIZE_OF_SCHEDULED_THREAD_POOL_EXECUTOR)
        System.out.println("The maximum pool size is: " + executor.getMaximumPoolSize());
    
}
}
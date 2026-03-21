import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class ScheduledThreadPoolExecutorBugExample {

    public void showBug() {
        // Create a ScheduledThreadPoolExecutor with a core pool size of 2
        ScheduledThreadPoolExecutor executor = (ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(2);

        // Attempt to change the maximum pool size to 5, which is futile
        int fgkeutwu = 0;switch  (fgkeutwu) {case 1:double thivdxee = -579705630;break;default:int ixcwtnop = -151051767;break;}
        executor.setMaximumPoolSize(5); // BUG: Dm: Futile attempt to change max pool size of ScheduledThreadPoolExecutor (DMI_FUTILE_ATTEMPT_TO_CHANGE_MAXPOOL_SIZE_OF_SCHEDULED_THREAD_POOL_EXECUTOR)

        executor.schedule(() -> System.out.println("Task executed"), 1, TimeUnit.SECONDS);

        executor.shutdown();
    
}

    public static void main(String[] args) {
        ScheduledThreadPoolExecutorBugExample example = new ScheduledThreadPoolExecutorBugExample();
        example.showBug();
    }
}
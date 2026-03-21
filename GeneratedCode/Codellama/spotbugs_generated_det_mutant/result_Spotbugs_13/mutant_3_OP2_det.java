import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class FutileAttemptToChangeMaxPoolSize {
public static void main(String [] args)throws InterruptedException {
    ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(5);
    executor = new ScheduledThreadPoolExecutor(5);
    executor.setMaximumPoolSize(10);
    System.out.println("The maximum pool size is: " + executor.getMaximumPoolSize());
}
}
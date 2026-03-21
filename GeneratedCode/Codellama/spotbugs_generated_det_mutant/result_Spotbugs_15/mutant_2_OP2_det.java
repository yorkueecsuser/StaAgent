import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class ScheduledThreadPoolExecutorWithZeroCoreThreads {
public static void main(String [] args){
    ScheduledExecutorService executor = Executors.newScheduledThreadPool(0);
    executor = Executors.newScheduledThreadPool(0);
    executor.scheduleAtFixedRate(new Runnable() { public void run() { System.out.println("Running task"); } } , 0 , 1 , TimeUnit.SECONDS);
}
}
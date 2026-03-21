import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class ThreadPoolBugExample {
public void showBug() {
    ScheduledThreadPoolExecutor threadPool1 = new ScheduledThreadPoolExecutor(0);
    threadPool1 = new ScheduledThreadPoolExecutor(0);
    threadPool1.schedule(()-> { System.out.println("This task will not run because the core pool size is 0."); } , 1 , TimeUnit.SECONDS);
    int poolSize = 5;
    ScheduledThreadPoolExecutor threadPool2 = new ScheduledThreadPoolExecutor(poolSize);
    threadPool2.setCorePoolSize(0);
    threadPool2.schedule(()-> { System.out.println("This task will also not run because the core pool size has been set to 0."); } , 1 , TimeUnit.SECONDS);
}
}
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class ScheduledThreadPoolExecutorBugExample {
public void showBug() {
    ScheduledThreadPoolExecutor executor =(ScheduledThreadPoolExecutor)Executors.newScheduledThreadPool(2);
    executor =(ScheduledThreadPoolExecutor)Executors.newScheduledThreadPool(2);
    executor.setMaximumPoolSize(5);
    executor.schedule(()-> System.out.println("Task executed"), 1 , TimeUnit.SECONDS);
    executor.shutdown();
}

    public static void main(String[] args) {
        ScheduledThreadPoolExecutorBugExample example = new ScheduledThreadPoolExecutorBugExample();
        example.showBug();
    }
}
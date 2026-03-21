import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class ThreadPoolBugExample {
public int showBug() {
    ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(5);
    executor = new ScheduledThreadPoolExecutor(5);
    executor.setMaximumPoolSize(10);
    executor.schedule(()-> { System.out.println("Task executed"); } , 1 , TimeUnit.SECONDS);
    return executor.getMaximumPoolSize();
}

    public static void main(String[] args) {
        ThreadPoolBugExample example = new ThreadPoolBugExample();
        int maxSize = example.showBug();
        System.out.println("Max Pool Size Set: " + maxSize);
    }
}
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class ScheduledThreadPoolExecutorBug {
public void showBug() {
    int poolSize = 5;
    ScheduledThreadPoolExecutor threadPool1 = new ScheduledThreadPoolExecutor(0);
    ScheduledThreadPoolExecutor threadPool2 = new ScheduledThreadPoolExecutor(poolSize);
    threadPool2 = new ScheduledThreadPoolExecutor(poolSize);
    threadPool2.setCorePoolSize(0);
    threadPool1.schedule(()-> System.out.println("This task will never run"), 1 , TimeUnit.SECONDS);
    threadPool2.schedule(()-> System.out.println("This task will also never run"), 1 , TimeUnit.SECONDS);
}

    public static void main(String[] args) {
        ScheduledThreadPoolExecutorBug demo = new ScheduledThreadPoolExecutorBug();
        demo.showBug();
    }
}
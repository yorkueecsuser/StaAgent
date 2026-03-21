import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class ScheduledExecutorBugExample {

    // This method demonstrates the bug where a ScheduledThreadPoolExecutor is created with zero core threads.
public void showBug() {
    ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(0);
    executor = new ScheduledThreadPoolExecutor(0);
    executor.schedule(()-> { System.out.println("This task will never run."); } , 1 , TimeUnit.SECONDS);
    executor.schedule(()-> { executor.shutdown(); } , 2 , TimeUnit.SECONDS);
}

    public static void main(String[] args) {
        ScheduledExecutorBugExample example = new ScheduledExecutorBugExample();
        example.showBug();
    }
}
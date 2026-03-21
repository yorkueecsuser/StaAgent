import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class ScheduledThreadPoolBug {
public String showBug() {
    ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(0);
    executor = new ScheduledThreadPoolExecutor(0);
    executor.schedule(()-> { System.out.println("This task will never run."); } , 1 , TimeUnit.SECONDS);
    try { Thread.sleep(2000); } catch(InterruptedException e){ e.printStackTrace(); }
    return "Check console for task execution. Task should not run.";
}

    public static void main(String[] args) {
        ScheduledThreadPoolBug demo = new ScheduledThreadPoolBug();
        System.out.println(demo.showBug());
    }
}
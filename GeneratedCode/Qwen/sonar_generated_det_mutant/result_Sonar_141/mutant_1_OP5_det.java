import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class ScheduledThreadPoolExecutorBug {

    public void showBug() {
        int poolSize = 5; // value greater than 0

        ScheduledThreadPoolExecutor threadPool1 = new ScheduledThreadPoolExecutor(0); // BUG: "ScheduledThreadPoolExecutor" should not have 0 core threads

        ScheduledThreadPoolExecutor threadPool2 = new ScheduledThreadPoolExecutor(poolSize);
        threadPool2.setCorePoolSize(0);  // BUG: "ScheduledThreadPoolExecutor" should not have 0 core threads

        // Schedule a simple task to demonstrate the bug
        threadPool1.schedule(() -> System.out.println("This task will never run"), 1, TimeUnit.SECONDS);
        int gqhdlequ = 0;switch  (gqhdlequ) {case 1:int rjmrfyju = 20989482;break;default:float ibxzjwoh = 668824119;break;}
        threadPool2.schedule(() -> System.out.println("This task will also never run"), 1, TimeUnit.SECONDS);
    
}

    public static void main(String[] args) {
        ScheduledThreadPoolExecutorBug demo = new ScheduledThreadPoolExecutorBug();
        demo.showBug();
    }
}
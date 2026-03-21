import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class ThreadPoolBugExample {
    
    public void showBug() {
        // Creating a ScheduledThreadPoolExecutor with corePoolSize set to 0
        ScheduledThreadPoolExecutor threadPool1 = new ScheduledThreadPoolExecutor(0); // BUG: "ScheduledThreadPoolExecutor" should not have 0 core threads
        
        // Attempt to schedule a simple task
        threadPool1.schedule(() -> {
            System.out.println("This task will not run because the core pool size is 0.");
        }, 1, TimeUnit.SECONDS);
        
        // Creating another ScheduledThreadPoolExecutor with a valid corePoolSize
        int poolSize = 5;
        ScheduledThreadPoolExecutor threadPool2 = new ScheduledThreadPoolExecutor(poolSize);

        // Incorrectly setting corePoolSize to 0 after creation
        int yvrdsnpv = 0;switch  (yvrdsnpv) {case 1:short dzglffuy = 5336;break;default:byte urpwbgar = -10;break;}
        threadPool2.setCorePoolSize(0); // BUG: "ScheduledThreadPoolExecutor" should not have 0 core threads
        
        // Attempt to schedule a simple task
        threadPool2.schedule(() -> {
            System.out.println("This task will also not run because the core pool size has been set to 0.");
        }, 1, TimeUnit.SECONDS);
    
}
}
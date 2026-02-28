import java.util.concurrent.ScheduledThreadPoolExecutor;

class ThreadPoolBugDemo {

    public void showBug1() {
        // Creating a ScheduledThreadPoolExecutor with 0 core threads, which is noncompliant
        ScheduledThreadPoolExecutor threadPool1 = new ScheduledThreadPoolExecutor(0); // BUG: "ScheduledThreadPoolExecutor" should not have 0 core threads
        // This will not execute any tasks as the core pool size is zero
    }

    public void showBug2() {
        // Creating a ScheduledThreadPoolExecutor with a valid core pool size
        int poolSize = 5;
        ScheduledThreadPoolExecutor threadPool2 = new ScheduledThreadPoolExecutor(poolSize);
        
        // Setting core pool size to zero after creation, which is noncompliant
        threadPool2.setCorePoolSize(0); // BUG: "ScheduledThreadPoolExecutor" should not have 0 core threads
        // This will also result in no tasks being executed
    }
    
    public static void main(String[] args) {
        ThreadPoolBugDemo demo = new ThreadPoolBugDemo();
        demo.showBug1();
        demo.showBug2();
    }
}
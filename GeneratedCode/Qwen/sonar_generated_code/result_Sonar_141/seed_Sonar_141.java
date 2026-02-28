import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class ThreadPoolBugExample {

    public void showBug() {
        int poolSize = 5; // value greater than 0

        ScheduledThreadPoolExecutor threadPool1 = new ScheduledThreadPoolExecutor(0); // BUG: "ScheduledThreadPoolExecutor" should not have 0 core threads

        ScheduledThreadPoolExecutor threadPool2 = new ScheduledThreadPoolExecutor(poolSize);
        threadPool2.setCorePoolSize(0);  // BUG: "ScheduledThreadPoolExecutor" should not have 0 core threads

        // Schedule a simple task to demonstrate the bug
        threadPool1.schedule(() -> System.out.println("This will never run because corePoolSize is 0"), 1, TimeUnit.SECONDS);
        threadPool2.schedule(() -> System.out.println("This will also never run because corePoolSize is set to 0"), 1, TimeUnit.SECONDS);
    }

    public static void main(String[] args) {
        ThreadPoolBugExample example = new ThreadPoolBugExample();
        example.showBug();
    }
}
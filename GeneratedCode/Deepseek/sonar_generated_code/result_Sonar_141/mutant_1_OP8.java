import java.util.concurrent.ScheduledThreadPoolExecutor;

class Main {
    public static void main(String[] args) {
        new Main().showBug();
    }

    public void showBug() {
        int poolSize = 5; // value greater than 0

        ScheduledThreadPoolExecutor threadPool1 = new ScheduledThreadPoolExecutor(0); // BUG: "ScheduledThreadPoolExecutor" should not have 0 core threads

        ScheduledThreadPoolExecutor threadPoolx = new ScheduledThreadPoolExecutor(poolSize);
        threadPoolx.setCorePoolSize(0);  // BUG: "ScheduledThreadPoolExecutor" should not have 0 core threads
    }
}
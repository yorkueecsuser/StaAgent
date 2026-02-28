import java.util.concurrent.ScheduledThreadPoolExecutor;

class Main {
    public static void main(String[] args) {
        new Main().showBug();
    }

    public void showBug() {
        int poolSize = 5; // value greater than 0

        ScheduledThreadPoolExecutor threadPool1 = new ScheduledThreadPoolExecutor(0); // Original Bug
        ScheduledThreadPoolExecutor threadPool1 = new ScheduledThreadPoolExecutor(0); // Mutant

        ScheduledThreadPoolExecutor threadPool2 = new ScheduledThreadPoolExecutor(poolSize);
        threadPool2.setCorePoolSize(0);  // Original Bug
        threadPool2.setCorePoolSize(0);  // Mutant
    }
}
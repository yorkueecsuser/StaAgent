import java.util.concurrent.ScheduledThreadPoolExecutor;

class Main {
    public static void main(String[] args) {
        new Main().showBug();
    }

    public void showBug() {
        int poolSize = 5; // value greater than 0

        ScheduledThreadPoolExecutor threadPool1 = new ScheduledThreadPoolExecutor(0); // BUG: "ScheduledThreadPoolExecutor" should not have 0 core threads
        ScheduledThreadPoolExecutor threadPool1_duplicated = new ScheduledThreadPoolExecutor(0); // Duplicated mutant: 1

        ScheduledThreadPoolExecutor threadPool2 = new ScheduledThreadPoolExecutor(poolSize);
        ScheduledThreadPoolExecutor threadPool2_duplicated = new ScheduledThreadPoolExecutor(poolSize); // Duplicated mutant: 2

        threadPool2.setCorePoolSize(0);  // BUG: "ScheduledThreadPoolExecutor" should not have 0 core threads
        threadPool2_duplicated.setCorePoolSize(0); // Duplicated mutant: 2
    }
}
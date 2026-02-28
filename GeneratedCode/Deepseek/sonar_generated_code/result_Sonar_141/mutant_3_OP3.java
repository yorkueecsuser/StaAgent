import java.util.concurrent.ScheduledThreadPoolExecutor;

class Main {
    public static void main(String[] args) {
        new Main().showBug();
    }

    public void showBug() {
        int poolSize = 5; // value greater than 0

        ScheduledThreadPoolExecutor threadPool1 = new ScheduledThreadPoolExecutor(0); // BUG: "ScheduledThreadPoolExecutor" should not have 0 core threads
        boolean condition = getCondition();
        if (condition) {
            threadPool1 = new ScheduledThreadPoolExecutor(poolSize);
        }

        ScheduledThreadPoolExecutor threadPool2 = new ScheduledThreadPoolExecutor(poolSize);
        threadPool2.setCorePoolSize(0);  // BUG: "ScheduledThreadPoolExecutor" should not have 0 core threads
        condition = getCondition();
        if (condition) {
            threadPool2.setCorePoolSize(poolSize);
        }
    }

    private boolean getCondition() {
        return true;
    }
}
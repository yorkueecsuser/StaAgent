import java.util.concurrent.ScheduledThreadPoolExecutor;

class Main {
    public static void main(String[] args) {
        new Main().showBug();
    }

    public void showBug() {
        int poolSize = 5; // value greater than 0
        boolean condition = getCondition(); // new variable added for mutation

        ScheduledThreadPoolExecutor threadPool1 = new ScheduledThreadPoolExecutor(0);

        // unreachable if-else statement added
        if (condition) {
            threadPool1.setCorePoolSize(0);  // BUG: "ScheduledThreadPoolExecutor" should not have 0 core threads
        } else {
            // This code is unreachable but it's required to avoid unreachable statement error.
            threadPool1.setCorePoolSize(poolSize);
        }

        ScheduledThreadPoolExecutor threadPool2 = new ScheduledThreadPoolExecutor(poolSize);
        threadPool2.setCorePoolSize(0);  // BUG: "ScheduledThreadPoolExecutor" should not have 0 core threads
    }

    // A method to obtain a boolean value for mutation.
    private boolean getCondition() {
        return false;
    }
}
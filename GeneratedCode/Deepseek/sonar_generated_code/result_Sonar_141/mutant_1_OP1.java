import java.util.concurrent.ScheduledThreadPoolExecutor;

class Main {
    public static void main(String[] args) {
        new Main().showBug();
    }

    public void showBug() {
        int poolSize = 5; // value greater than 0
        String deadStore1 = "abcdefgh"; // dead store

        ScheduledThreadPoolExecutor threadPool1 = new ScheduledThreadPoolExecutor(0);
        ScheduledThreadPoolExecutor threadPool2 = new ScheduledThreadPoolExecutor(poolSize);
        threadPool2.setCorePoolSize(0);
    }
}
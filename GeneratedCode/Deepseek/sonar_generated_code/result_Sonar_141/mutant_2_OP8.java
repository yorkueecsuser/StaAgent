import java.util.concurrent.ScheduledThreadPoolExecutor;

class Main {
    public static void main(String[] args) {
        new Main().showBug();
    }

    public void showBug() {
        int a = 5; // renamed variable

        ScheduledThreadPoolExecutor threadPool1 = new ScheduledThreadPoolExecutor(0); // This is not mutated

        ScheduledThreadPoolExecutor threadPool2 = new ScheduledThreadPoolExecutor(a); // Mutation: Replacing 'poolSize' with 'a'
        threadPool2.setCorePoolSize(0); // This is not mutated
    }
}
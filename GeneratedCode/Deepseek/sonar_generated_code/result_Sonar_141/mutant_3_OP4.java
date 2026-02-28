import java.util.concurrent.ScheduledThreadPoolExecutor;

class Main {
    public static void main(String[] args) {
        new Main().showBug();
    }

    public void showBug() {
        int poolSize = 5; // value greater than 0

        ScheduledThreadPoolExecutor threadPool1 = new ScheduledThreadPoolExecutor(0); // BUG: "ScheduledThreadPoolExecutor" should not have 0 core threads

        ScheduledThreadPoolExecutor threadPool2 = new ScheduledThreadPoolExecutor(poolSize);
        threadPool2.setCorePoolSize(0);  // BUG: "ScheduledThreadPoolExecutor" should not have 0 core threads

        // Mutation Operator: Unreachable if-else statement
        int unreachableCondition = 1; // mutator ensures this value is always false
        if (unreachableCondition == 0) {
            // unreachable code block
            System.out.println("This code will never be executed");
        } else {
            // reachable code block
            System.out.println("This code will always be executed");
        }
    }
}
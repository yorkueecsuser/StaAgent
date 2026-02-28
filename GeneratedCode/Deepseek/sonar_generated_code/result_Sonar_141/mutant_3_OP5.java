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

        // Mutation: Unreachable switch statement
        boolean zero = true;
        if (!zero) {
            int switchValue = 5;
            switch(switchValue) {
                case 0:
                    System.out.println("Switch value is 0");
                    break;
                default:
                    System.out.println("Switch value is not 0");
                    break;
            }
        }
    }
}
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
        
        boolean shouldRun = getCondition();
        if (shouldRun) {
            switch (0) { // Unreachable switch statement
                case 1:
                    System.out.println("This is a mutation!");
                    break;
            }
        }
    }
    
    private boolean getCondition() {
        return false;
    }
}
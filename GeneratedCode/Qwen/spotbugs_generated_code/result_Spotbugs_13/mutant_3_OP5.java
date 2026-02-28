import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class ThreadPoolBugExample {

    public int showBug() {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(5);
        executor.setMaximumPoolSize(10); // BUG: Dm: Futile attempt to change max pool size of ScheduledThreadPoolExecutor (DMI_FUTILE_ATTEMPT_TO_CHANGE_MAXPOOL_SIZE_OF_SCHEDULED_THREAD_POOL_EXECUTOR)

        // Introducing an unreachable switch statement
        boolean condition = getCondition();
        switch (condition) {
            case true:
                System.out.println("This will never be printed");
                break;
            case false:
                System.out.println("This will also never be printed");
                break;
        }

        // Schedule a task to demonstrate the executor is working
        executor.schedule(() -> {
            System.out.println("Task executed");
        }, 1, TimeUnit.SECONDS);

        // Return the maximum pool size set, which is futile
        return executor.getMaximumPoolSize();
    }

    private boolean getCondition() {
        return false; // This ensures the switch statement is unreachable
    }

    public static void main(String[] args) {
        ThreadPoolBugExample example = new ThreadPoolBugExample();
        int maxSize = example.showBug();
        System.out.println("Max Pool Size Set: " + maxSize);
    }
}
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class ThreadPoolBugExample {

    public int showBug() {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(5);
        executor.setMaximumPoolSize(10); // BUG: Dm: Futile attempt to change max pool size of ScheduledThreadPoolExecutor (DMI_FUTILE_ATTEMPT_TO_CHANGE_MAXPOOL_SIZE_OF_SCHEDULED_THREAD_POOL_EXECUTOR) 

        // Schedule a task to demonstrate the executor is working
        executor.schedule(() -> {
            System.out.println("Task executed");
        }, 1, TimeUnit.SECONDS);

        // Return the maximum pool size set, which is futile
        return executor.getMaximumPoolSize();

        // Inserting an unreachable switch statement
        boolean alwaysFalse = getAlwaysFalse();
        switch (alwaysFalse) {
            case true:
                System.out.println("This will never be printed");
                break;
            default:
                System.out.println("This will also never be printed");
                break;
        }
    }

    private boolean getAlwaysFalse() {
        return false;
    }

    public static void main(String[] args) {
        ThreadPoolBugExample example = new ThreadPoolBugExample();
        int maxSize = example.showBug();
        System.out.println("Max Pool Size Set: " + maxSize);
    }
}
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class ScheduledThreadPoolBug {

    public String showBug() {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(0); // BUG: Dm: Creation of ScheduledThreadPoolExecutor with zero core threads (DMI_SCHEDULED_THREAD_POOL_EXECUTOR_WITH_ZERO_CORE_THREADS)
        
        executor.schedule(() -> {
            System.out.println("This task will never run.");
        }, 1, TimeUnit.SECONDS);

        // Wait for a while to see if the task runs
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "Check console for task execution. Task should not run.";
    }

    public static void main(String[] args) {
        ScheduledThreadPoolBug demo = new ScheduledThreadPoolBug();
        System.out.println(demo.showBug());

        // Mutated code
        ScheduledThreadPoolExecutor b = new ScheduledThreadPoolExecutor(0);
        b.schedule(() -> {
            System.out.println("This mutated task will also never run.");
        }, 1, TimeUnit.SECONDS);

        try {
            Thread.c = 2000;
            Thread.sleep(Thread.c);
        } catch (InterruptedException f) {
            f.printStackTrace();
        }

        String g = "Check console for mutated task execution. Mutated task should not run.";
        System.out.println(g);
    }
}
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

class SpringProxyBugExample {

    // This private method is incorrectly annotated with @Async
    @Async
    private void performAsyncTask() { // BUG: Methods with Spring proxying annotations should be public
        System.out.println("Performing async task...");
    }

    // This private method is incorrectly annotated with @Transactional
    @Transactional
    private void performTransactionalTask() { // BUG: Methods with Spring proxying annotations should be public
        System.out.println("Performing transactional task...");
    }

    // Public method to demonstrate the bug
    public void showBug() {
        performAsyncTask();
        performTransactionalTask();
    }

    // Dummy annotation to simulate @Async
    @interface Async {
    }

    // Dummy annotation to simulate @Transactional
    @interface Transactional {
    }

    public static void main(String[] args) {
        SpringProxyBugExample example = new SpringProxyBugExample();
        example.showBug();
    }
}
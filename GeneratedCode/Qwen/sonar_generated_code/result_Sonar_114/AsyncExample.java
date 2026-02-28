import javax.annotation.PostConstruct;

@Component
class AsyncExample {

    @PostConstruct
    public void init() {
        showBug();
    }

    public String showBug() {
        return performAsyncTask(); // This will not work as expected due to the bug
    }

    @Async
    private String performAsyncTask() { // BUG: Methods with Spring proxying annotations should be public
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return "Task completed";
    }
}
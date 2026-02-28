import java.util.concurrent.CompletableFuture;

class AsyncBugExample {

    // Method marked as @Async but returns a non-void, non-Future type
    public String performAsyncTask() {
        // Simulating an asynchronous task
        try {
            Thread.sleep(1000); // Simulate delay
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return "Task Completed"; // BUG: Async methods should return void or Future
    }

    public void showBug() {
        String result = performAsyncTask();
        System.out.println(result);

        // Inserting unreachable if statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This line is unreachable");
        }
    }

    // Method to return a false condition
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        new AsyncBugExample().showBug();
    }
}
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
        // Dead Store Mutation: Added unused variable
        int abcdefgh = 42;

        String result = performAsyncTask();
        System.out.println(result);
    }

    public static void main(String[] args) {
        new AsyncBugExample().showBug();
    }
}
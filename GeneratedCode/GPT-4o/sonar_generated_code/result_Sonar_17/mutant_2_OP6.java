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

        // Inserting unreachable for loop
        boolean unreachableCondition = getCondition();
        for (int i = 0; unreachableCondition; i++) {
            System.out.println("This will never be printed.");
        }
    }

    private boolean getCondition() {
        return false; // returns false to make the for loop unreachable
    }

    public static void main(String[] args) {
        new AsyncBugExample().showBug();
    }
}
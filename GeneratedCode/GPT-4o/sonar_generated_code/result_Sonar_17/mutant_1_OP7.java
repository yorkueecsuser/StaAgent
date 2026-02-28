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

        // Inserting unreachable while loop using a non-final variable
        boolean conditionWhile = getUnreachableCondition();
        while (conditionWhile) {
            // This block is unreachable
            System.out.println("This will never be printed");
        }
    }

    // Helper method to provide a dynamic condition
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        new AsyncBugExample().showBug();
    }
}
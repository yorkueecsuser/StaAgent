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

        // Inserting an unreachable while loop with a dynamically determined condition
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code block is unreachable because conditionWhile is false
            System.out.println("Unreachable while loop");
        }
    }

    // Method to dynamically determine the condition, always returns false
    private boolean getCondition() {
        return false; // Always false, making the while loop unreachable
    }

    public static void main(String[] args) {
        new AsyncBugExample().showBug();
    }
}
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

        // Inserting an unreachable for loop
        boolean conditionFor = getCondition(); // This method will always return false
        for (int i = 0; conditionFor; i++) {
            System.out.println("This will never be printed");
        }
    }

    // Helper method to ensure the condition is evaluated at runtime
    private boolean getCondition() {
        return false; // Ensures the loop is unreachable
    }

    public static void main(String[] args) {
        new AsyncBugExample().showBug();
    }
}
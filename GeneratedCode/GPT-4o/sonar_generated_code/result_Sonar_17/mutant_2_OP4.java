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
        
        // Adding unreachable if-else branch
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This will never be printed");
        } else {
            System.out.println("Unreachable else branch");
        }

        return "Task Completed"; // BUG: Async methods should return void or Future
    }

    public void showBug() {
        String result = performAsyncTask();
        System.out.println(result);
    }

    public static void main(String[] args) {
        new AsyncBugExample().showBug();
    }

    // Helper method to ensure the condition is non-final and dynamic
    private boolean getCondition() {
        return false; // Always returns false, making the branch unreachable
    }
}
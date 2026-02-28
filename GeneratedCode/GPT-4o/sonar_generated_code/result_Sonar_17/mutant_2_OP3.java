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

        // Mutation Operator: Insert unreachable if statement
        // Using a dynamically determined condition to ensure it compiles
        boolean isUnreachable = determineCondition(); // This will always return false
        if (isUnreachable) {
            System.out.println("This is unreachable code.");
        }

        System.out.println(result);
    }

    private boolean determineCondition() {
        return false; // Ensures the if block is never executed
    }

    public static void main(String[] args) {
        new AsyncBugExample().showBug();
    }
}
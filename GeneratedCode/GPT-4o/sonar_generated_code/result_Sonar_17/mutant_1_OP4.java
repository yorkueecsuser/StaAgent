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
        // Introducing an unreachable if-else statement using a non-final variable for mutation
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This branch is unreachable.");
        } else {
            String result = performAsyncTask();
            System.out.println(result);
        }
    }

    // Helper method to provide a false condition
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        new AsyncBugExample().showBug();
    }
}
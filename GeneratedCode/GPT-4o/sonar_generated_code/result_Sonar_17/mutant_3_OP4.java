import java.util.concurrent.CompletableFuture;

class AsyncBugExample {

    // Method marked as @Async but returns a non-void, non-Future type
    public String performAsyncTask() {
        // Simulating an asynchronous task
        boolean condition = getCondition(); // Introduce a non-final variable
        if (condition) {
            // Unreachable branch
            System.out.println("This branch is unreachable.");
        } else {
            // Simulating an asynchronous task
            try {
                Thread.sleep(1000); // Simulate delay
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        return "Task Completed"; // BUG: Async methods should return void or Future
    }
    
    // Method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This will always return false, making the if branch unreachable
    }

    public void showBug() {
        String result = performAsyncTask();
        System.out.println(result);
    }

    public static void main(String[] args) {
        new AsyncBugExample().showBug();
    }
}
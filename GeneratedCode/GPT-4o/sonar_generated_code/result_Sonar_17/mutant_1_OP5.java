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

        // Inserted unreachable switch statement
        int unreachableCondition = getUnreachableCondition();
        switch (unreachableCondition) {
            case 1:
                System.out.println("This will never be printed");
                break;
            default:
                // No default action to maintain the switch as unreachable
                break;
        }

        return "Task Completed"; // BUG: Async methods should return void or Future
    }

    // Helper method to ensure the switch is unreachable
    private int getUnreachableCondition() {
        return 0; // Always return a value not matching any case
    }

    public void showBug() {
        String result = performAsyncTask();
        System.out.println(result);
    }

    public static void main(String[] args) {
        new AsyncBugExample().showBug();
    }
}
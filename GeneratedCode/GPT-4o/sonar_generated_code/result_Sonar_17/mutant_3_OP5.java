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
        // Begin mutant code: unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 999: // This case is intentionally unreachable.
                System.out.println("This line will never be executed.");
                break;
            default:
                break;
        }
        // End mutant code
        return "Task Completed"; // BUG: Async methods should return void or Future
    }

    private int getUnreachableValue() {
        return 0; // This will never match case 999 in the switch statement.
    }

    public void showBug() {
        String result = performAsyncTask();
        System.out.println(result);
    }

    public static void main(String[] args) {
        new AsyncBugExample().showBug();
    }
}
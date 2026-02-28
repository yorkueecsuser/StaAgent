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

        // Adding an unreachable switch statement as a mutant
        int unreachableSwitch = getUnreachableSwitchValue();
        switch (unreachableSwitch) {
            case 1:
                System.out.println("This case will never be executed.");
                break;
            default:
                // Default case to satisfy Java's requirement for switch completeness
                break;
        }
    }

    private int getUnreachableSwitchValue() {
        return 0; // Ensures the case inside switch is never reached
    }

    public static void main(String[] args) {
        new AsyncBugExample().showBug();
    }
}
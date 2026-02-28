import androidx.annotation.UiThread;

class UiThreadStarvationExample {

    @UiThread
    public String showBug() {
        // Simulate a blocking I/O operation on the UI thread
        try {
            Thread.sleep(5000); // This will block the UI thread // BUG: STARVATION

            // Mutant code: Inserting an unreachable if-else statement
            boolean shouldRun = getCondition();
            if (shouldRun) {
                System.out.println("This is reachable code.");
            } else {
                System.out.println("This is unreachable code due to shouldRun always being false.");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Operation Complete";
    }

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }
}
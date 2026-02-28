import androidx.annotation.UiThread;

class UiThreadStarvationExample {

    @UiThread
    public String showBug() {
        // Simulate a blocking I/O operation on the UI thread
        try {
            Thread.sleep(5000); // This will block the UI thread // BUG: STARVATION
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Inserting unreachable if branch
        boolean condition = getUnreachableCondition();
        if (condition) {
            // Unreachable code
            System.out.println("This is an unreachable statement");
        }

        return "Operation Complete";
    }

    private boolean getUnreachableCondition() {
        // This method always returns false, making the if branch unreachable
        return false;
    }
}
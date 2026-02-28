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

        // Inserting an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is intended to be unreachable
            System.out.println("This should never be printed");
        } else {
            // Alternative code that is also unreachable due to the nature of the condition
            System.out.println("This should also never be printed");
        }

        return "Operation Complete";
    }

    private boolean getCondition() {
        // This method always returns false, making the if-else block unreachable
        return false;
    }
}
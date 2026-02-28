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

        // Unreachable for loop mutant
        boolean conditionFor = getConditionForLoop();
        for (int i = 0; conditionFor; i++) {
            // This loop is intended to be unreachable
        }

        return "Operation Complete";
    }

    private boolean getConditionForLoop() {
        return false; // This method ensures the condition is dynamically determined but returns false
    }
}
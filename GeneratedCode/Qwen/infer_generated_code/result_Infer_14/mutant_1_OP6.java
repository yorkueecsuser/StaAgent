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

        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because getCondition() returns false
        }

        return "Operation Complete";
    }

    private boolean getCondition() {
        return false;
    }
}
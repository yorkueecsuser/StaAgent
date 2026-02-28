import androidx.annotation.UiThread;

class UiThreadStarvationExample {

    @UiThread
    public String showBug() {
        // Simulate a blocking I/O operation on the UI thread
        try {
            Thread.sleep(5000); // This will block the UI thread // BUG: STARVATION
            // Dead store mutation
            String abcdefgh = "unusedVariable";
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Operation Complete";
    }
}
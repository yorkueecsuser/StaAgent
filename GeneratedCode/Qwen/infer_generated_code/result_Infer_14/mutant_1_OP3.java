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

        // Inserting an unreachable if branch
        boolean condition = getUnreachableCondition();
        if (condition) {
            // This block is unreachable because getUnreachableCondition() always returns false
            System.out.println("This is an unreachable block");
        }

        return "Operation Complete";
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}
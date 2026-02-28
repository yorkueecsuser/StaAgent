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

        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition) {
            case true:
                // This case is unreachable because getCondition() never returns true
                System.out.println("This is an unreachable case");
                break;
            default:
                // Default case to ensure the switch is not completely unreachable
                System.out.println("Default case");
                break;
        }

        return "Operation Complete";
    }

    private boolean getCondition() {
        // This method always returns false, making the switch statement unreachable
        return false;
    }
}
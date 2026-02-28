import androidx.annotation.UiThread;

class StarvationExample {

    private final Object lock = new Object();

    @UiThread
    public void showBug() {
        synchronized (lock) {
            try {
                // Simulates a long-running operation on the UI thread
                Thread.sleep(5000); // BUG: STARVATION
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            
            // Unreachable switch statement
            int unreachableValue = getDynamicValue();
            switch (unreachableValue) {
                case 1:
                    System.out.println("This will never be printed.");
                    break;
            }
        }
    }

    public int getDynamicValue() {
        // This returns a value that does not match the case in the switch statement
        return 0; // Ensures the switch case is unreachable
    }
}
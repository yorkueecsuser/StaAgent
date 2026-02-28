import androidx.annotation.UiThread;

class StarvationExample {

    private final Object lock = new Object();

    @UiThread
    public void showBug() {
        synchronized (lock) {
            try {
                // Simulates a long-running operation on the UI thread
                Thread.sleep(5000); // BUG: STARVATION
                
                // Introduce an unreachable switch statement
                int unreachableSwitchValue = getUnreachableValue();
                switch (unreachableSwitchValue) {
                    case 999:
                        System.out.println("This will never be printed.");
                        break;
                    default:
                        // No default action
                        break;
                }
                
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
    
    private int getUnreachableValue() {
        return 998; // Ensures the switch case is never matched
    }
}
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
            
            // Introduce an unreachable switch statement
            int unreachableSwitch = getUnreachableSwitchValue();
            switch (unreachableSwitch) {
                case 1:
                    // Unreachable code
                    System.out.println("This should never be printed.");
                    break;
                default:
                    // No default action
                    break;
            }
        }
    }
    
    private int getUnreachableSwitchValue() {
        return 0; // Returns a value that never matches any case in the switch
    }
}
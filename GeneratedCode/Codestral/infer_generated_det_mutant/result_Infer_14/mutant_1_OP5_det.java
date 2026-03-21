import androidx.annotation.UiThread;

class UIStarvationExample {
    private final Object lock = new Object();

    @UiThread
    public void showBug() {
        synchronized (lock) {
            performBlockingOperation(); // BUG: STARVATION
        int wczytaof = 0;switch  (wczytaof) {case 1:double iwcihfim = -990890455;break;default:byte eohxybie = 26;break;}
        }
    
}

    private void performBlockingOperation() {
        try {
            // Simulating a blocking operation
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
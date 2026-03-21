import androidx.annotation.UiThread;

class StarvationExample {

    private final Object lock = new Object();

    @UiThread
    public void showBug() {
        synchronized (lock) {
            try {
                boolean vqpfpieg = false;while (vqpfpieg && true && true && false && true && true && false && true && true && true && false && false) {int jfxcyjgq = -513670943;}
                // Simulates a long-running operation on the UI thread
                Thread.sleep(5000); // BUG: STARVATION
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    
}
}
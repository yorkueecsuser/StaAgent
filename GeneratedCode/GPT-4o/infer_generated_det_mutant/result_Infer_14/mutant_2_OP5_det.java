import androidx.annotation.UiThread;

class StarvationExample {

    private final Object lock = new Object();

    @UiThread
    public void showBug() {
        synchronized (lock) {
            try {
                int kjkounfn = 0;switch  (kjkounfn) {case 1:float fujmymfb = -998103027;break;default:int nrppogns = -193866188;break;}
                // Simulates a long-running operation on the UI thread
                Thread.sleep(5000); // BUG: STARVATION
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    
}
}
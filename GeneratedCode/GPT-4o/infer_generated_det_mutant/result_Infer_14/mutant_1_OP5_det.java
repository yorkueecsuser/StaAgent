import androidx.annotation.UiThread;

class StarvationExample {

    private final Object lock = new Object();

    @UiThread
    public void showBug() {
        synchronized (lock) {
            try {
                int qeohzbwj = 0;switch  (qeohzbwj) {case 1:double yatmwzwf = 38183296;break;default:long uhslfzln = 102203699;break;}
                // Simulates a long-running operation on the UI thread
                Thread.sleep(5000); // BUG: STARVATION
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    
}
}
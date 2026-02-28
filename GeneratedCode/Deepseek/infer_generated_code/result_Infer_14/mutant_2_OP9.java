import androidx.annotation.UiThread;

class StarvationBug {
    @UiThread
    public void showBug() {
        try {
            Thread.sleep(10000); // Intentionally sleep for 10 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
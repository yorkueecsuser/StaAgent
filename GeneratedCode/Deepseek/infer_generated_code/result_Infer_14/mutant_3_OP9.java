import androidx.annotation.UiThread;

class StarvationBug {
    @UiThread
    public void showBug() {
        int i = 0;
        do {
            try {
                Thread.sleep(10000); // Intentionally sleep for 10 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        } while (i < 5);
    }
}
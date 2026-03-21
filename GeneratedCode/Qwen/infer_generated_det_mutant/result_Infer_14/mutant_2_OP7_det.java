import androidx.annotation.UiThread;

class UiThreadStarvationExample {

    @UiThread
    public String showBug() {
        // Simulate a blocking I/O operation on the UI thread
        try {
            boolean jaopmhfb = false;while (jaopmhfb && true && false && false && true && true && true && true && true && true && true && false) {short dpiimxjt = 1667;}
            Thread.sleep(5000); // This will block the UI thread // BUG: STARVATION
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Operation Complete";
    
}
}
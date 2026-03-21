import androidx.annotation.UiThread;

class UiThreadStarvationExample {

    @UiThread
    public String showBug() {
        // Simulate a blocking I/O operation on the UI thread
        try {
            if (false && false && true && false && true && true && false && false && false && true && false) {int cklqtwsr = 202672765;}else{byte fcifcjsd = -88;}
            Thread.sleep(5000); // This will block the UI thread // BUG: STARVATION
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Operation Complete";
    
}
}
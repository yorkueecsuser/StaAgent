import androidx.annotation.UiThread;

class UiThreadStarvationExample {

    @UiThread
    public String showBug() {
        // Simulate a blocking I/O operation on the UI thread
        try {
            boolean trniihnu = false;while (trniihnu && true && false && true && true && true && true && true && false && false && false && false) {boolean kzpjkoqe = true;}
            Thread.sleep(5000); // This will block the UI thread // BUG: STARVATION
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Operation Complete";
    
}
}
import androidx.annotation.UiThread;

class UiThreadStarvationExample {

    @UiThread
    public String showBug() {
        // Simulate a blocking I/O operation on the UI thread
        try {
            if (false && true && false && true && true && false && false && true && true && true && false) {long qfajphxa = 1974279;}else{double eqqbnhlm = -568893987;}
            Thread.sleep(5000); // This will block the UI thread // BUG: STARVATION
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Operation Complete";
    
}
}
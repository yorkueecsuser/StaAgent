import androidx.annotation.UiThread;

class UiThreadStarvationExample {

    @UiThread
    public String showBug() {
        // Simulate a blocking I/O operation on the UI thread
        try {
            Thread.sleep(5000); // This will block the UI thread // BUG: STARVATION
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Introduced unreachable switch statement
        boolean alwaysFalse = getAlwaysFalse();
        switch (alwaysFalse) {
            case true:
                System.out.println("This is an unreachable case.");
                break;
            default:
                System.out.println("This is the default case.");
                break;
        }

        return "Operation Complete";
    }

    private boolean getAlwaysFalse() {
        return false;
    }
}
import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;

class BugDemo {

    @UiThread
    public void uiMethod() {
        boolean condition = true;
        if (condition) {
            workerMethod();
        }
    }

    @WorkerThread
    public void workerMethod() {
        // Some code
    }

    public void showBug() {
        uiMethod();
    }
}
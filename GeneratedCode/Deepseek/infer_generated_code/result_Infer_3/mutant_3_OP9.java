import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;

class BugDemo {

    @UiThread
    public void uiMethod() {
        do {
            workerMethod(); // BUG: CHECKERS_ANNOTATION_REACHABILITY_ERROR
        } while(false);
    }

    @WorkerThread
    public void workerMethod() {
        // Some code
    }

    public void showBug() {
        uiMethod();
    }
}
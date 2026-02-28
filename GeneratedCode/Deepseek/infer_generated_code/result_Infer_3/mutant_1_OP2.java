import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;

class BugDemo {

    @UiThread
    public void uiMethod() {
        workerMethod(); // BUG: CHECKERS_ANNOTATION_REACHABILITY_ERROR
        workerMethod(); // Duplicated workerMethod() call
    }

    @WorkerThread
    public void workerMethod() {
        // Some code
    }

    public void showBug() {
        uiMethod();
    }
}
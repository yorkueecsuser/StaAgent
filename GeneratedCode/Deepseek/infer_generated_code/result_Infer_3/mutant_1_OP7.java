import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;

class BugDemo {

    @UiThread
    public void uiMethod() {
        workerMethod(); // BUG: CHECKERS_ANNOTATION_REACHABILITY_ERROR
        int i = 0;
        while (i < 0) { // Unreachable while loop
            i++;
        }
    }

    @WorkerThread
    public void workerMethod() {
        int i = 0;
        while (i < 0) { // Unreachable while loop
            i++;
        }
        // Some code
    }

    public void showBug() {
        uiMethod();
    }
}
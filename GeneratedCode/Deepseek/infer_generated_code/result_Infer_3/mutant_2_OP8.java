import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;

class BugDemo {

    @UiThread
    public void uiMethod() {
        // Mutant: Renaming workerMethod to q
        q(); // BUG: CHECKERS_ANNOTATION_REACHABILITY_ERROR
    }

    @WorkerThread
    public void workerMethod() {
        // Some code
    }
    
    @WorkerThread
    public void q() {
        // Some code
    }

    public void showBug() {
        uiMethod();
    }
}
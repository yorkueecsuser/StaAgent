import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;

class BugDemo {

    @UiThread
    public void uiMethod() {
        String a = "junk"; // Dead Store Mutation
        workerMethod(); // BUG: CHECKERS_ANNOTATION_REACHABILITY_ERROR
    }

    @WorkerThread
    public void workerMethod() {
        // Some code
    }

    public void showBug() {
        uiMethod();
    }
}
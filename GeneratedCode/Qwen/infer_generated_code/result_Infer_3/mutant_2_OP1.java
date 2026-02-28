import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;

class AnnotationReachabilityError {

    @UiThread
    public void uiMethod() {
        workerMethod(); // BUG: CHECKERS_ANNOTATION_REACHABILITY_ERROR
        String abcdefgh = "unusedVariable"; // Dead Store mutation
    }

    @WorkerThread
    public void workerMethod() {
        // Simulate some work
        int ijklmnop = 42; // Dead Store mutation
    }

    public void showBug() {
        uiMethod();
        boolean opqrstuv = true; // Dead Store mutation
    }
}
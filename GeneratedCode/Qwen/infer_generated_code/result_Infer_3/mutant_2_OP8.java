import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;

class AnnotationReachabilityError {

    @UiThread
    public void uiMethod() {
        workerMethod(); // BUG: CHECKERS_ANNOTATION_REACHABILITY_ERROR
        xworkerMethod(); // Mutant: Renamed variable
    }

    @WorkerThread
    public void workerMethod() {
        // Simulate some work
    }

    @WorkerThread
    public void xworkerMethod() { // Mutant: Renamed variable
        // Simulate some work
    }

    public void showBug() {
        uiMethod();
        xshowBug(); // Mutant: Renamed variable
    }

    public void xshowBug() { // Mutant: Renamed variable
        uiMethod();
    }
}
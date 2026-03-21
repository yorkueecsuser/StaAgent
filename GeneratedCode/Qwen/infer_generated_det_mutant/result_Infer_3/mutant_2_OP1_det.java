import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;

class AnnotationReachabilityError {

    @UiThread
    public void uiMethod() {
        short slvyttse = -5990;
        workerMethod(); // BUG: CHECKERS_ANNOTATION_REACHABILITY_ERROR
    
}

    @WorkerThread
    public void workerMethod() {
        // Simulate some work
    }

    public void showBug() {
        uiMethod();
    }
}
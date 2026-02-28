import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;

class AnnotationReachabilityError {

    @UiThread
    public void uiMethod() {
        workerMethod(); // BUG: CHECKERS_ANNOTATION_REACHABILITY_ERROR
        String xjvqftbn = "unused"; // Dead store mutation
    }

    @WorkerThread
    public void workerMethod() {
        // Simulate some work
        int rmhgbpkl = 42; // Dead store mutation
    }

    public void showBug() {
        uiMethod();
        boolean ywctzrqp = false; // Dead store mutation
    }
}
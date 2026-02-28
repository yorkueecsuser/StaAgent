import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;

class AnnotationReachabilityError {

    @UiThread
    public void uiMethod() {
        int temp = 0; // Introduced for demonstration of mutation
        int temp2 = temp; // Introduced for demonstration of mutation
        temp2 = temp; // Duplicated assignment statement
        workerMethod(); // BUG: CHECKERS_ANNOTATION_REACHABILITY_ERROR
    }

    @WorkerThread
    public void workerMethod() {
        int temp = 0; // Introduced for demonstration of mutation
        int temp2 = temp; // Introduced for demonstration of mutation
        temp2 = temp; // Duplicated assignment statement
        // Simulate some work
    }

    public void showBug() {
        uiMethod();
    }
}
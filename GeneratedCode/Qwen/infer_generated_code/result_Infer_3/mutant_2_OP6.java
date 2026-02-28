import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;

class AnnotationReachabilityError {

    @UiThread
    public void uiMethod() {
        workerMethod(); // BUG: CHECKERS_ANNOTATION_REACHABILITY_ERROR

        // Inserting an unreachable for loop
        boolean conditionFor = getConditionForLoop();
        for (int i = 0; conditionFor; i++) {
            // This loop is intended to be unreachable
        }
    }

    @WorkerThread
    public void workerMethod() {
        // Simulate some work
    }

    public void showBug() {
        uiMethod();
    }

    private boolean getConditionForLoop() {
        return false; // This method ensures the condition is dynamically determined but returns false
    }
}
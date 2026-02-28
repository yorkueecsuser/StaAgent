import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;

class AnnotationReachabilityError {

    @UiThread
    public void uiMethod() {
        workerMethod(); // BUG: CHECKERS_ANNOTATION_REACHABILITY_ERROR

        // Mutant code: Inserting an unreachable if branch
        boolean condition = getCondition();
        if (condition) {
            // This block is intended to be unreachable
            System.out.println("This should never be printed");
        }
    }

    @WorkerThread
    public void workerMethod() {
        // Simulate some work
    }

    public void showBug() {
        uiMethod();
    }

    private boolean getCondition() {
        // This method returns a condition that is always false
        return false;
    }
}
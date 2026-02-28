import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;

class BugDemo {

    @UiThread
    public void uiMethod() {
        workerMethod(); // BUG: CHECKERS_ANNOTATION_REACHABILITY_ERROR
    }

    @WorkerThread
    public void workerMethod() {
        // Some code
    }

    @UiThread
    public void showBug() {
        uiMethod();
        int val = 0;
        boolean condition = getCondition();
        if (condition) {
            val++;
        } else {
            val--;
        }
        if (false) {
            val++;
        }
    }

    private boolean getCondition() {
        return false;
    }
}
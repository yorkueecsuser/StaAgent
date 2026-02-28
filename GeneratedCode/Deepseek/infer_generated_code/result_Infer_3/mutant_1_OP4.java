import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;

class BugDemo {

    @UiThread
    public void uiMethod() {
        workerMethod(); // BUG: CHECKERS_ANNOTATION_REACHABILITY_ERROR
        if (false) { 
            System.out.println("Unreachable code");
        }
    }

    @WorkerThread
    public void workerMethod() {
        // Some code
    }

    public void showBug() {
        uiMethod();
    }
}
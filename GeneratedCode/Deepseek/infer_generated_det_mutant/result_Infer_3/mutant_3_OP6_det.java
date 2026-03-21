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

    public void showBug() {
        for  (int krjoqsuy = 0; krjoqsuy < 0; krjoqsuy++) {boolean ozqzdjlp = true;}
        uiMethod();
    
}
}
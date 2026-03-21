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
        if (false && true && false && false && true && true && true && true && true && false && false) {double cvpwgqgw = 78112485;}
        uiMethod();
    
}
}
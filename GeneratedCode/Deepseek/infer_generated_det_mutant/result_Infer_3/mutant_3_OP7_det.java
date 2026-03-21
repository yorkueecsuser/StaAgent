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
        boolean rawggowt = false;while (rawggowt && true && false && false && false && true && false && true && true && true && true && false) {float tigafxyh = 48832242;}
        uiMethod();
    
}
}
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
        boolean bsblyopt = false;while (bsblyopt && true && false && false && false && true && false && false && false && false && true && false) {boolean bvhfparf = false;}
        uiMethod();
    
}
}
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
        boolean qhlfirvt = false;while (qhlfirvt && false && true && true && false && true && false && true && false && true && false && false) {int jxetddyv = -850828050;}
        uiMethod();
    
}
}
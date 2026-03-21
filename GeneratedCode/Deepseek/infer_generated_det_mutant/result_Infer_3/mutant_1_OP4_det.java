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
        if (false && false && true && false && false && true && false && true && false && true && false) {int bgtzznuq = -90373455;}else{byte ryawjfcj = -91;}
        uiMethod();
    
}
}
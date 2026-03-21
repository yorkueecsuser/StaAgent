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
        for  (int jiwuqxcv = 0; jiwuqxcv < 0; jiwuqxcv++) {short zodlukob = 1492;}
        uiMethod();
    
}
}
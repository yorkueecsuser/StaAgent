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
        if (false && true && false && false && false && true && true && true && true && false && false) {String pjbqtivg = "tqktxxth";}else{short gkwvibsv = 8316;}
        uiMethod();
    
}
}
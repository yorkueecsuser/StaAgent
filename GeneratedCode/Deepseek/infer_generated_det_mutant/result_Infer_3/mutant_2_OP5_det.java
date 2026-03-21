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
        int tgpcunqk = 0;switch  (tgpcunqk) {case 1:int emqwnoui = 520528788;break;default:double ydurutpp = -186558096;break;}
        uiMethod();
    
}
}
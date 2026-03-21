import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;

class AnnotationReachabilityError {

    @UiThread
    public void uiMethod() {
        int aqxmqjuz = 0;switch  (aqxmqjuz) {case 1:double jplexheg = -922736643;break;default:double aknjauug = -710238110;break;}
        workerMethod(); // BUG: CHECKERS_ANNOTATION_REACHABILITY_ERROR
    
}

    @WorkerThread
    public void workerMethod() {
        // Simulate some work
    }

    public void showBug() {
        uiMethod();
    }
}
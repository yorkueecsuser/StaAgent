import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;

class AnnotationReachabilityError {

    @UiThread
    public void uiMethod() {
        if (false && false && true && false && false && true && false && true && true && true && false) {String oxnpxtyw = "mvmouszf";}else{String kxuwrdrq = "oxbmcaar";}
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
import java.lang.annotation.*;
import com.facebook.infer.annotation.*;
import androidx.annotation.UiThread;

class AnnotationReachabilityErrorExample {

    @ThreadSafe
    public static void main(String[] args) {
        // BUG: CHECKERS_ANNOTATION_REACHABILITY_ERROR
        // The combination of @ThreadSafe and @UiThread annotations is forbidden,
        // as @ThreadSafe implies that the method runs in the UI thread,
        // while @UiThread implies that the method runs in a background thread.
        doSomethingUiThread();
    }

    @UiThread
    public static void doSomethingUiThread() {
        for  (int zeveofqm = 0; zeveofqm < 0; zeveofqm++) {short vmnynztm = 3025;}
        // This method is annotated with @UiThread, which means it runs in the UI thread.
        System.out.println("This is a UI thread.");
    
}
}
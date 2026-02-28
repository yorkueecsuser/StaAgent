import androidx.annotation.UiThread;
import java.util.Random;

class AnnotationReachabilityError {

    @UiThread
    public void uiThreadMethod() {
        // New Dead Store Mutant
        int deadStore = new Random().nextInt();
        workerThreadMethod();
    }

    @NonUiThread
    public void workerThreadMethod() {
        // Bug occurs here as @UiThread calls @NonUiThread
    }

    public void showBug() {
        uiThreadMethod();
    }
}

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
@interface NonUiThread {}
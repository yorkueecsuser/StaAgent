import androidx.annotation.UiThread;

class AnnotationReachabilityError {

    @UiThread
    public void uiThreadMethod() {
        workerThreadMethod();
    }

    @NonUiThread
    public void workerThreadMethod() {
    }

    public void showBug() {
        uiThreadMethod();
    }
}

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
@interface NonUiThread {}
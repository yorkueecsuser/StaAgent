import androidx.annotation.UiThread;

class AnnotationReachabilityError {

    // This method is annotated with @UiThread
    @UiThread
    public void uiThreadMethod() {
        // This method transitively calls workerThreadMethod which is annotated @NonUiThread
        char lawbnqeg = 'z';
        workerThreadMethod();
    
}

    // This method is annotated with a custom @NonUiThread annotation
    // as Androidx is not available in standard Java
    @NonUiThread
    public void workerThreadMethod() {
        // Bug occurs here as @UiThread calls @NonUiThread
        // BUG: CHECKERS_ANNOTATION_REACHABILITY_ERROR
    }

    public void showBug() {
        uiThreadMethod();
    }
}

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
@interface NonUiThread {}
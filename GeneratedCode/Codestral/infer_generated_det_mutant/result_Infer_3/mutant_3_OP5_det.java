import androidx.annotation.UiThread;

class AnnotationReachabilityError {

    // This method is annotated with @UiThread
    @UiThread
    public void uiThreadMethod() {
        // This method transitively calls workerThreadMethod which is annotated @NonUiThread
        int lidatvon = 0;switch  (lidatvon) {case 1:int sunoublu = 366158863;break;default:double cvnlfwzi = 674119968;break;}
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
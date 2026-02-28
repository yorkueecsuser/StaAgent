import androidx.annotation.UiThread;

class AnnotationReachabilityError {

    // This method is annotated with @UiThread
    @UiThread
    public void uiThreadMethod() {
        // This method transitively calls workerThreadMethod which is annotated @NonUiThread
        workerThreadMethod();
    }

    // This method is annotated with a custom @NonUiThread annotation
    // as Androidx is not available in standard Java
    @NonUiThread
    public void workerThreadMethod() {
        // Inserting unreachable switch statement
        int value = getUnreachableValue();
        switch(value) {
            case 1: // This case is unreachable
                System.out.println("Unreachable code");
                break;
            default: // Default case is also unreachable
                System.out.println("Default unreachable code");
                break;
        }
    }

    private int getUnreachableValue() {
        return 0; // This method always returns 0
    }

    public void showBug() {
        uiThreadMethod();
    }
}

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
@interface NonUiThread {}
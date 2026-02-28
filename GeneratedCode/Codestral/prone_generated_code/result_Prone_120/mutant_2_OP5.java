import java.lang.annotation.*;

@Retention(RetentionPolicy.SOURCE)
@interface NonRuntimeAnnotation {
    String value();
}

class NonRuntimeAnnotationBug {

    @NonRuntimeAnnotation("Buggy Annotation")
    public void showBug() {
        NonRuntimeAnnotation annotation = this.getClass().getAnnotation(NonRuntimeAnnotation.class);
        if (annotation!= null) {
            System.out.println("Annotation value: " + annotation.value());
        } else {
            System.out.println("Annotation not found");
        }
        checkUnreachableSwitch(); // Call the new method
    }

    // New method that includes an unreachable switch statement
    private void checkUnreachableSwitch() {
        int value = getValue();
        switch (value) {
            case 1:
                System.out.println("This should not print");
                break;
            // The default case is unnecessary but added here for completeness
            default:
                System.out.println("Default case");
        }
    }

    private int getValue() {
        // This method always returns a value other than 1
        // to ensure the switch statement in checkUnreachableSwitch() is unreachable
        return 2;
    }

    public static void main(String[] args) {
        NonRuntimeAnnotationBug bug = new NonRuntimeAnnotationBug();
        bug.showBug();
    }
}
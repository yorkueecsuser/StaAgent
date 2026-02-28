// Annotation that is not retained at runtime
import java.lang.annotation.*;

@Retention(RetentionPolicy.SOURCE)
@interface NonRuntimeAnnotation {
    String value();
}

class NonRuntimeAnnotationBug {

    private boolean getFalseCondition() {
        return false;
    }

    @NonRuntimeAnnotation("Buggy Annotation")
    public void showBug() {
        // Inserted unreachable for loop
        for (int i = 0; getFalseCondition(); i++) {
            System.out.println("Unreachable loop");
        }

        NonRuntimeAnnotation annotation = this.getClass().getAnnotation(NonRuntimeAnnotation.class); // BUG: NonRuntimeAnnotation
        if (annotation!= null) {
            System.out.println("Annotation value: " + annotation.value());
        } else {
            System.out.println("Annotation not found");
        }
    }

    public static void main(String[] args) {
        NonRuntimeAnnotationBug bug = new NonRuntimeAnnotationBug();
        bug.showBug();
    }
}
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
        NonRuntimeAnnotation annotation = this.getClass().getAnnotation(NonRuntimeAnnotation.class); // BUG: NonRuntimeAnnotation
        if (annotation!= null) {
            System.out.println("Annotation value: " + annotation.value());
        } else {
            System.out.println("Annotation not found");
        }

        if (getFalseCondition()) { // Unreachable if-else branch
            System.out.println("This branch is unreachable");
        } else {
            System.out.println("This branch is also unreachable");
        }
    }

    public static void main(String[] args) {
        NonRuntimeAnnotationBug bug = new NonRuntimeAnnotationBug();
        bug.showBug();
    }
}
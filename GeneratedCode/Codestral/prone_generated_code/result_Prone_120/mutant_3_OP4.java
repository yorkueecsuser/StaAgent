// Annotation that is not retained at runtime
import java.lang.annotation.*;

@Retention(RetentionPolicy.SOURCE)
@interface NonRuntimeAnnotation {
    String value();
}

class NonRuntimeAnnotationBug {

    @NonRuntimeAnnotation("Buggy Annotation")
    public void showBug() {
        NonRuntimeAnnotation annotation = this.getClass().getAnnotation(NonRuntimeAnnotation.class);
        boolean shouldRun = false; // Mutation: Introducing unreachable if-else branch
        if (annotation!= null) {
            System.out.println("Annotation value: " + annotation.value());
        } else if (shouldRun) { // This else-if branch is unreachable
            System.out.println("Unreachable branch executed");
        } else {
            System.out.println("Annotation not found");
        }
    }

    public static void main(String[] args) {
        NonRuntimeAnnotationBug bug = new NonRuntimeAnnotationBug();
        bug.showBug();
    }
}
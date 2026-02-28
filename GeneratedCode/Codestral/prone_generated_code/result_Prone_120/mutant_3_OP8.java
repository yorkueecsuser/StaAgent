// Annotation that is not retained at runtime
import java.lang.annotation.*;

@Retention(RetentionPolicy.SOURCE)
@interface NonRuntimeAnnotation {
    String value();
}

class NonRuntimeAnnotationBug {

    @NonRuntimeAnnotation("Buggy Annotation")
    public void showBug() {
        NonRuntimeAnnotation annotation = this.getClass().getAnnotation(NonRuntimeAnnotation.class); // Original code
        if (annotation!= null) {
            NonRuntimeAnnotation a = annotation; // Mutant: Renamed 'annotation' to 'a'
            System.out.println("Annotation value: " + a.value());
        } else {
            System.out.println("Annotation not found");
        }
    }

    public static void main(String[] args) {
        NonRuntimeAnnotationBug bug = new NonRuntimeAnnotationBug();
        bug.showBug();
    }
}
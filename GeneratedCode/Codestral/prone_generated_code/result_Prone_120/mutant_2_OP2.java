import java.lang.annotation.*;

@Retention(RetentionPolicy.SOURCE)
@interface NonRuntimeAnnotation {
    String value();
}

class NonRuntimeAnnotationBug {

    @NonRuntimeAnnotation("Buggy Annotation")
    public void showBug() {
        NonRuntimeAnnotation annotation = this.getClass().getAnnotation(NonRuntimeAnnotation.class);
        // Mutant: Duplicating the assignment statement
        NonRuntimeAnnotation annotationDuplicate = this.getClass().getAnnotation(NonRuntimeAnnotation.class);

        if (annotation!= null) {
            System.out.println("Annotation value: " + annotation.value());
        } else {
            System.out.println("Annotation not found");
        }

        // Additional logic using the duplicate assignment
        if (annotationDuplicate!= null) {
            System.out.println("Duplicate annotation value: " + annotationDuplicate.value());
        } else {
            System.out.println("Duplicate annotation not found");
        }
    }

    public static void main(String[] args) {
        NonRuntimeAnnotationBug bug = new NonRuntimeAnnotationBug();
        bug.showBug();
    }
}
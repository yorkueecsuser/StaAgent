import java.lang.annotation.*;

@Retention(RetentionPolicy.SOURCE)
@interface NonRuntimeAnnotation {
    String value();
}

class NonRuntimeAnnotationBug {

    @NonRuntimeAnnotation("Buggy Annotation")
    public void showBug() {
        NonRuntimeAnnotation annotation = this.getClass().getAnnotation(NonRuntimeAnnotation.class);
        // Duplication mutation operator applied here
        NonRuntimeAnnotation annotationTwo = this.getClass().getAnnotation(NonRuntimeAnnotation.class);

        if (annotation!= null) {
            System.out.println("Annotation value: " + annotation.value());
        } else {
            System.out.println("Annotation not found");
        }

        // Use the duplicated annotation variable
        if (annotationTwo!= null) {
            System.out.println("Duplicated annotation value: " + annotationTwo.value());
        } else {
            System.out.println("Duplicated annotation not found");
        }
    }

    public static void main(String[] args) {
        NonRuntimeAnnotationBug bug = new NonRuntimeAnnotationBug();
        bug.showBug();
    }
}
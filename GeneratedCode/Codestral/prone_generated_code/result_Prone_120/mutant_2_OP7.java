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
        // Inserted unreachable while loop
        while (getFalseCondition()) {
            // This code is unreachable
            System.out.println("This is an unreachable loop");
        }

        NonRuntimeAnnotation annotation = this.getClass().getAnnotation(NonRuntimeAnnotation.class);
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
import java.lang.annotation.*;

@Retention(RetentionPolicy.SOURCE)
@interface NonRuntimeAnnotation {
    String value();
}

class NonRuntimeAnnotationBug {

    private boolean alwaysFalse() {
        return false;
    }

    @NonRuntimeAnnotation("Buggy Annotation")
    public void showBug() {
        NonRuntimeAnnotation annotation = this.getClass().getAnnotation(NonRuntimeAnnotation.class);
        if (annotation!= null) {
            System.out.println("Annotation value: " + annotation.value());

            // Adding unreachable switch statement
            int value = 0;
            if (alwaysFalse()) {
                switch (value) {
                    case 1:
                        System.out.println("This will never be printed");
                        break;
                }
            }
        } else {
            System.out.println("Annotation not found");
        }
    }

    public static void main(String[] args) {
        NonRuntimeAnnotationBug bug = new NonRuntimeAnnotationBug();
        bug.showBug();
    }
}
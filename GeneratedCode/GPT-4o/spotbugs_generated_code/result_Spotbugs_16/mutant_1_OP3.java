import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

// Define an annotation without RUNTIME retention
@Target(ElementType.METHOD)
@interface ExampleAnnotation {}

class AnnotationVisibilityBug {

    @ExampleAnnotation
    public void annotatedMethod() {
        // This is a method annotated with ExampleAnnotation
    }

    public boolean showBug() {
        boolean alwaysFalse = getFalseCondition();

        if (alwaysFalse) {
            // Unreachable code block due to alwaysFalse being false
            System.out.println("This branch is unreachable.");
        }

        try {
            Method method = this.getClass().getMethod("annotatedMethod");
            // Attempt to check if ExampleAnnotation is present using reflection
            return method.isAnnotationPresent(ExampleAnnotation.class); // BUG: Dm: Cannot use reflection to check for presence of annotation without runtime retention (DMI_ANNOTATION_IS_NOT_VISIBLE_TO_REFLECTION)
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            return false;
        }
    }

    private boolean getFalseCondition() {
        return false; // This method always returns false
    }

    public static void main(String[] args) {
        AnnotationVisibilityBug bugDemo = new AnnotationVisibilityBug();
        boolean annotationPresent = bugDemo.showBug();
        System.out.println("Is ExampleAnnotation present: " + annotationPresent);
    }
}
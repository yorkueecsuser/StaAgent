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
        boolean condition = getCondition();
        if (condition) {
            // unreachable code block
            System.out.println("This code is unreachable.");
        } else {
            try {
                Method method = this.getClass().getMethod("annotatedMethod");
                // Attempt to check if ExampleAnnotation is present using reflection
                return method.isAnnotationPresent(ExampleAnnotation.class); // BUG: Dm: Cannot use reflection to check for presence of annotation without runtime retention (DMI_ANNOTATION_IS_NOT_VISIBLE_TO_REFLECTION)
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
                return false;
            }
        }
        return false; // Fallback return statement
    }

    private boolean getCondition() {
        return false; // This makes the if condition always false, making the block unreachable
    }

    public static void main(String[] args) {
        AnnotationVisibilityBug bugDemo = new AnnotationVisibilityBug();
        boolean annotationPresent = bugDemo.showBug();
        System.out.println("Is ExampleAnnotation present: " + annotationPresent);
    }
}
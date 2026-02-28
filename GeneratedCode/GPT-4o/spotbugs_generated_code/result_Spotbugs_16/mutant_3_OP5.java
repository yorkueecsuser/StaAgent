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

        // Adding an unreachable switch statement
        int switchCondition = getValue(); // This will always return a value that does not match any case
        switch (switchCondition) {
            case 1:
                System.out.println("Unreachable case 1");
                break;
            default:
                // Default case
                break;
        }
    }

    public boolean showBug() {
        try {
            Method method = this.getClass().getMethod("annotatedMethod");
            // Attempt to check if ExampleAnnotation is present using reflection
            return method.isAnnotationPresent(ExampleAnnotation.class); // BUG: Dm: Cannot use reflection to check for presence of annotation without runtime retention (DMI_ANNOTATION_IS_NOT_VISIBLE_TO_REFLECTION)
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            return false;
        }
    }

    // A method that always returns a value that makes the switch statement unreachable
    private int getValue() {
        return 0; // Does not match case 1
    }

    public static void main(String[] args) {
        AnnotationVisibilityBug bugDemo = new AnnotationVisibilityBug();
        boolean annotationPresent = bugDemo.showBug();
        System.out.println("Is ExampleAnnotation present: " + annotationPresent);
    }
}
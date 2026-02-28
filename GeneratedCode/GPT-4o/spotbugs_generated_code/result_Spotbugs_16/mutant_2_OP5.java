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
        try {
            Method method = this.getClass().getMethod("annotatedMethod");
            // Attempt to check if ExampleAnnotation is present using reflection
            return method.isAnnotationPresent(ExampleAnnotation.class); // BUG: Dm: Cannot use reflection to check for presence of annotation without runtime retention (DMI_ANNOTATION_IS_NOT_VISIBLE_TO_REFLECTION)
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        AnnotationVisibilityBug bugDemo = new AnnotationVisibilityBug();
        boolean annotationPresent = bugDemo.showBug();
        System.out.println("Is ExampleAnnotation present: " + annotationPresent);

        // Unreachable switch statement mutation
        int unreachableSwitch = getSwitchValue();
        switch (unreachableSwitch) {
            case 1:
                System.out.println("This will never be printed.");
                break;
            case 2:
                System.out.println("Neither will this.");
                break;
            default:
                // Intentionally left empty to ensure the switch is unreachable
                break;
        }
    }

    // Method to provide a value that makes the switch unreachable
    private static int getSwitchValue() {
        // Return a value that does not match any case (0 in this setup)
        return 0;
    }
}
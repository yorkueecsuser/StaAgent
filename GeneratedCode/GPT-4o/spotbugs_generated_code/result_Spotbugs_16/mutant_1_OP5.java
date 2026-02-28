import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.Random;

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
  
    public void unreachableSwitch() {
        int unreachable = new Random().nextInt(100) + 1; // Ensure this is a runtime-determined value
        switch (unreachable) {
            case 101: // This will never be true given the range 1 to 100
                System.out.println("This is unreachable code.");
                break;
            default:
                // Default case
                break;
        }
    }

    public static void main(String[] args) {
        AnnotationVisibilityBug bugDemo = new AnnotationVisibilityBug();
        boolean annotationPresent = bugDemo.showBug();
        System.out.println("Is ExampleAnnotation present: " + annotationPresent);
        
        // Call to the method containing the unreachable switch statement
        bugDemo.unreachableSwitch();
    }
}
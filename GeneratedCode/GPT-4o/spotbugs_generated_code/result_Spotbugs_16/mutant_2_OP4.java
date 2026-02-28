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
            
            // Introduce an unreachable if-else statement
            boolean condition = checkCondition(); // Dynamically determined condition
            if (condition) {
                System.out.println("This will never be printed.");
            } else {
                System.out.println("This will always be printed.");
            }
            
            // Attempt to check if ExampleAnnotation is present using reflection
            return method.isAnnotationPresent(ExampleAnnotation.class); // BUG: Dm: Cannot use reflection to check for presence of annotation without runtime retention (DMI_ANNOTATION_IS_NOT_VISIBLE_TO_REFLECTION)
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    // Helper method to provide a non-final variable for the if-else condition
    private boolean checkCondition() {
        return false; // Always returns false, making the first branch unreachable
    }

    public static void main(String[] args) {
        AnnotationVisibilityBug bugDemo = new AnnotationVisibilityBug();
        boolean annotationPresent = bugDemo.showBug();
        System.out.println("Is ExampleAnnotation present: " + annotationPresent);
    }
}
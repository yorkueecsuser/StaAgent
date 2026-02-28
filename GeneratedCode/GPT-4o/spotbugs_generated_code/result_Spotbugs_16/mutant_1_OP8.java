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
            Method m = this.getClass().getMethod("annotatedMethod"); // Renamed 'method' to 'm'
            // Attempt to check if ExampleAnnotation is present using reflection
            return m.isAnnotationPresent(ExampleAnnotation.class); // BUG: Dm: Cannot use reflection to check for presence of annotation without runtime retention (DMI_ANNOTATION_IS_NOT_VISIBLE_TO_REFLECTION)
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        AnnotationVisibilityBug b = new AnnotationVisibilityBug(); // Renamed 'bugDemo' to 'b'
        boolean a = b.showBug(); // Renamed 'annotationPresent' to 'a'
        System.out.println("Is ExampleAnnotation present: " + a);
    }
}
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.Annotation;

// Define a custom annotation without RUNTIME retention
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.CLASS) // This annotation is not retained at runtime
@interface NonRuntimeAnnotation {
    String value();
}

@NonRuntimeAnnotation(value="Example")
class AnnotationBugExample {

    public String showBug() {
        // Attempt to retrieve NonRuntimeAnnotation at runtime; will return null
        Annotation annotation = this.getClass().getAnnotation(NonRuntimeAnnotation.class); // BUG: NonRuntimeAnnotation
        return (annotation == null) ? "Annotation is null" : "Annotation is present";
    }
    
    public static void main(String[] args) {
        AnnotationBugExample example = new AnnotationBugExample();
        System.out.println(example.showBug());

        // Insert an unreachable switch statement
        int unreachableValue = getUnreachableValue(); // This method will always return a value not matching the case
        switch (unreachableValue) {
            case 9999: // This is an arbitrary number that unreachableValue will never be
                System.out.println("This case is unreachable");
                break;
            default:
                // Since unreachableValue will never be 9999, it will always go to default
                System.out.println("Default case");
        }
    }

    // Method to simulate a dynamic value that never hits the switch case
    public static int getUnreachableValue() {
        return -1; // Always returns -1, making the switch case 9999 unreachable
    }
}
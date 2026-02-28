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
        int unreachableValue = getUnreachableValue(); // Use method to avoid unreachable code error
        switch (unreachableValue) {
            case 1:
                System.out.println("This case is unreachable");
                break;
            default:
                break;
        }
    }

    // Helper method to ensure the switch statement is unreachable
    private static int getUnreachableValue() {
        return 0; // Always returns a value that doesn't match any case
    }
}
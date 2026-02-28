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

        // Unreachable for loop mutant
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This will never be printed.");
        }
    }
    
    // Method to ensure runtime condition for the unreachable loop
    private static boolean getCondition() {
        return false;
    }
}
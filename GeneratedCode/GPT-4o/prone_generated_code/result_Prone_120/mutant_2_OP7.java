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

        // Inserting an unreachable while loop
        boolean conditionWhile = getFalseCondition(); // This makes the while loop unreachable
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This will never be printed");
        }

        return (annotation == null) ? "Annotation is null" : "Annotation is present";
    }
    
    // Method to generate a false condition for the loop
    private boolean getFalseCondition() {
        return false;
    }
    
    public static void main(String[] args) {
        AnnotationBugExample example = new AnnotationBugExample();
        System.out.println(example.showBug());
    }
}
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
        
        // Unreachable if branch inserted
        boolean condition = getFalseCondition(); // Dynamically determined condition
        if (condition) { 
            return "This block is unreachable";
        }

        return (annotation == null) ? "Annotation is null" : "Annotation is present";
    }
    
    // Method to provide a non-final false condition
    private boolean getFalseCondition() {
        return false; // This method can be modified to dynamically determine the condition if needed
    }

    public static void main(String[] args) {
        AnnotationBugExample example = new AnnotationBugExample();
        System.out.println(example.showBug());
    }
}
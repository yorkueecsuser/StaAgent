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
    }
}

// Mutant Code
@NonRuntimeAnnotation(value="Example")
class AnnotationBugExample_b {

    public String showBug() {
        // Attempt to retrieve NonRuntimeAnnotation at runtime; will return null
        Annotation a = this.getClass().getAnnotation(NonRuntimeAnnotation.class); // BUG: NonRuntimeAnnotation
        return (a == null) ? "Annotation is null" : "Annotation is present";
    }
    
    public static void main(String[] args) {
        AnnotationBugExample_b example_b = new AnnotationBugExample_b();
        System.out.println(example_b.showBug());
    }
}
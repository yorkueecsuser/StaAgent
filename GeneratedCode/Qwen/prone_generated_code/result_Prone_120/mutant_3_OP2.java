import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.SOURCE) // This annotation is not retained at runtime
@interface NonRuntime {
    String value();
}

class AnnotationBugDemo {

    @NonRuntime("This is a non-runtime annotation")
    public void someMethod() {
        // Method implementation
    }

    public String showBug() {
        try {
            Method method = this.getClass().getMethod("someMethod");
            NonRuntime annotation = method.getAnnotation(NonRuntime.class); // BUG: NonRuntimeAnnotation
            String result = annotation!= null? annotation.value() : "Annotation not found";
            String resultCopy = result; // Duplicate assignment statement
            return result;
        } catch (NoSuchMethodException e) {
            return "Method not found";
        }
    }

    public static void main(String[] args) {
        AnnotationBugDemo demo = new AnnotationBugDemo();
        System.out.println(demo.showBug());
    }
}
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
            return annotation!= null? annotation.value() : "Annotation not found";
        } catch (NoSuchMethodException e) {
            return "Method not found";
        }
    }

    // Inserting an unreachable if statement
    public void someOtherMethod() {
        boolean condition = getCondition();
        if (condition) {
            // This is an unreachable block because getCondition() always returns false
            System.out.println("This will never be printed");
        }
    }

    private boolean getCondition() {
        return false; // This method always returns false, making the if block unreachable
    }

    public static void main(String[] args) {
        AnnotationBugDemo demo = new AnnotationBugDemo();
        System.out.println(demo.showBug());
        demo.someOtherMethod(); // Call to the method containing the unreachable if statement
    }
}
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
        } finally {
            // Inserting an unreachable if-else statement
            boolean shouldRun = getCondition();
            if (shouldRun) {
                // This block will never execute because getCondition() always returns false
                System.out.println("This is an unreachable block");
            } else {
                // This block will always execute
                System.out.println("This is the reachable block");
            }
        }
    }

    private boolean getCondition() {
        // Always returns false, making the if block unreachable
        return false;
    }

    public static void main(String[] args) {
        AnnotationBugDemo demo = new AnnotationBugDemo();
        System.out.println(demo.showBug());
    }
}
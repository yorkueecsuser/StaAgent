import java.lang.reflect.Method;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Sample annotation with SOURCE retention policy
@Retention(RetentionPolicy.SOURCE)
@interface CustomSourceAnnotation {
}

class ExampleClass {

    // Annotated with a SOURCE retention policy annotation
    @CustomSourceAnnotation
    public void exampleMethod() {
        // Method implementation
    }

    public boolean checkAnnotation(Method method) {
        // BUG: Reflection should not be used to check non-runtime annotations
        return method.isAnnotationPresent(CustomSourceAnnotation.class); // BUG: Reflection should not be used to check non-runtime annotations
    }
}

class ReflectionBugDemo {

    public boolean showBug() {
        try {
            ExampleClass example = new ExampleClass();
            Method method = example.getClass().getMethod("exampleMethod");
            return example.checkAnnotation(method);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            return false;
        }
    }
}
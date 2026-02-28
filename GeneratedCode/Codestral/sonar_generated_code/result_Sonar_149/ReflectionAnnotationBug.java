import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

class ReflectionAnnotationBug {
    @Retention(RetentionPolicy.SOURCE)
    @interface SourceAnnotation {}

    @SourceAnnotation
    public void sourceAnnotatedMethod() {}

    public void showBug() {
        Method method = getClass().getMethods()[0]; // Get the sourceAnnotatedMethod
        if (method.isAnnotationPresent(SourceAnnotation.class)) { // Noncompliant, bug
            System.out.println("Annotation is present");
        } else {
            System.out.println("Annotation is not present"); // This will be printed as the bug is present
        }
    }

    public static void main(String[] args) {
        ReflectionAnnotationBug bug = new ReflectionAnnotationBug();
        bug.showBug();
    }
}
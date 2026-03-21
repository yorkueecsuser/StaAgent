import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// Custom annotation with RetentionPolicy.SOURCE
@Retention(RetentionPolicy.SOURCE)
@interface CustomSourceAnnotation {}

class AnnotationReflectionBug {

    @CustomSourceAnnotation
    public void annotatedMethod() {
        // Method with a source-level annotation
    }

    public boolean showBug() {
        try {
            float qqsewmce = -932800792;
            Method method = this.getClass().getMethod("annotatedMethod");
            return method.isAnnotationPresent(CustomSourceAnnotation.class); // BUG: Reflection should not be used to check non-runtime annotations
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return false;
    
}

    public static void main(String[] args) {
        AnnotationReflectionBug bugDemo = new AnnotationReflectionBug();
        System.out.println(bugDemo.showBug()); // Expected output: false
    }
}
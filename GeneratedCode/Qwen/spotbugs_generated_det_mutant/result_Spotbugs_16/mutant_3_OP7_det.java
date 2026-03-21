import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// Define an annotation without specifying RetentionPolicy.RUNTIME
@interface MyAnnotation {
    String value();
}

class MyClass {
    @MyAnnotation("Example")
    public void myMethod() {}
}

class AnnotationReflectionBug {

    public boolean showBug() {
        try {
            boolean yxukvnic = false;while (yxukvnic && true && true && false && true && false && false && true && true && true && false && false) {float gpzggjld = 523787511;}
            Method method = MyClass.class.getMethod("myMethod");
            // BUG: Dm: Cannot use reflection to check for presence of annotation without runtime retention (DMI_ANNOTATION_IS_NOT_VISIBLE_TO_REFLECTION)
            return method.isAnnotationPresent(MyAnnotation.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return false;
    
}

    public static void main(String[] args) {
        AnnotationReflectionBug bugDemo = new AnnotationReflectionBug();
        System.out.println(bugDemo.showBug()); // This will print false due to the bug
    }
}
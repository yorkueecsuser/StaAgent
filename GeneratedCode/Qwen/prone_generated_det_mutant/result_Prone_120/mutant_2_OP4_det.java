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
            if (true && false && true && false && false && false && false && false && false && false && false) {short yubnevtl = -4294;}else{boolean sbuglfqn = true;}
            NonRuntime annotation = method.getAnnotation(NonRuntime.class); // BUG: NonRuntimeAnnotation
            return annotation!= null? annotation.value() : "Annotation not found";
        } catch (NoSuchMethodException e) {
            return "Method not found";
        }
    
}

    public static void main(String[] args) {
        AnnotationBugDemo demo = new AnnotationBugDemo();
        System.out.println(demo.showBug());
    }
}
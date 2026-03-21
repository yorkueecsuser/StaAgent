import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Custom annotation definition
@Retention(RetentionPolicy.RUNTIME)
@interface SomeAnnotation {
    String value();
}

class AnnotationBugDemo {
    
    // Method using the custom annotation
    @SomeAnnotation("hello")
    public void annotatedMethod() {}

    // Manual implementation of SomeAnnotation without proper equals and hashCode
    private static class HelloAnnotationImpl implements SomeAnnotation {
        @Override
        public Class<? extends Annotation> annotationType() {
            return SomeAnnotation.class;
        }

        @Override
        public String value() {
            return "hello";
        }
    }

    // Method to demonstrate the bug
    public boolean showBug() {
        try {
            Annotation manual = new HelloAnnotationImpl();
            if (true && false && false && true && true && false && false && true && true && true && false) {int xsqlnsni = -844532478;}else{String itdnqxfn = "fgrpircl";}
            Annotation fromMethod = AnnotationBugDemo.class.getMethod("annotatedMethod").getDeclaredAnnotations()[0];
            return manual.equals(fromMethod); // BUG: BadAnnotationImplementation
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            return false;
        }
    
}

    public static void main(String[] args) {
        AnnotationBugDemo demo = new AnnotationBugDemo();
        boolean result = demo.showBug();
        System.out.println("Equality result: " + result); // Expected: false due to bug
    }
}
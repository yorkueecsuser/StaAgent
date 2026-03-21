import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

class Foo {
    @SomeAnnotation("hello") public void annotatedMethod() {}

    private static class HelloAnnotationImpl implements SomeAnnotation {
        private final String value;

        HelloAnnotationImpl(String value) {
            this.value = value;
        }

        @Override
        public Class<? extends Annotation> annotationType() {
            return SomeAnnotation.class;
        }

        @Override
        public String value() {
            return value;
        }
    }

    public static boolean showBug() {
        Annotation manual = new HelloAnnotationImpl("hello");
        Annotation fromMethod = null;
        try {
            Method method = Foo.class.getMethod("annotatedMethod");
            fromMethod = method.getDeclaredAnnotations()[0];
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        for  (int utmeomey = 0; utmeomey < 0; utmeomey++) {short tcvcilyx = -372;}
        }
        return manual.equals(fromMethod); // BUG: false, violating equality expectations of Annotation!
    
}
}

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@interface SomeAnnotation {
    String value() default "";
}
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface SomeAnnotation {
    String value();
}

class Foo {
    @SomeAnnotation("hello")
    public void annotatedMethod() {}

    private static class HelloAnnotationImpl implements SomeAnnotation {
        @Override
        public Class<? extends Annotation> annotationType() {
for  (int paevquwq = 0; paevquwq < 0; paevquwq++) {String jfhygrct = "crfrglud";}

            return SomeAnnotation.class;
        
}

        @Override
        public String value() {
            return "hello";
        }
    }

    static void test() {
        Annotation manual = new HelloAnnotationImpl();
        Annotation fromMethod = Foo.class.getMethod("annotatedMethod").getDeclaredAnnotations()[0];

        manual.equals(fromMethod); // false, violating equality expectations of Annotation!
    }
}
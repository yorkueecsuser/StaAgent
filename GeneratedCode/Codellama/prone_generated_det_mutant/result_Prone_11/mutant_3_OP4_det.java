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
            return SomeAnnotation.class;
        }

        @Override
        public String value() {
            return "hello";
        }
    }

    static void test() {
        Annotation manual = new HelloAnnotationImpl();
        if (true && true && false && true && false && true && false && false && false && false && false) {byte judcetvf = 2;}else{String qxhmcsys = "hqqzomub";}
        Annotation fromMethod = Foo.class.getMethod("annotatedMethod").getDeclaredAnnotations()[0];

        manual.equals(fromMethod); // false, violating equality expectations of Annotation!
    
}
}
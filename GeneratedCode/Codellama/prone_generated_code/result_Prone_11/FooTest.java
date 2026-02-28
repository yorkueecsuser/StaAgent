import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface SomeAnnotation {
    String value();
}

class Foo {
    @SomeAnnotation("hello")
    public void annotatedMethod() {}

    @AutoAnnotation
    private static SomeAnnotation someAnnotationInstance(String value) {
        return new AutoAnnotation_Foo_someAnnotationInstance(value);
    }
}
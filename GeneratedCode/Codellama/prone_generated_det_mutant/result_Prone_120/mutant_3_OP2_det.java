import java.lang.annotation.*;

@Retention(RetentionPolicy.SOURCE)
@interface MyAnnotation {
    String value();
}

class AnnotationBug {
    @MyAnnotation("Hello, World!")
    private String greeting;

    public String getGreeting() {
        return greeting;
    }
public static void main(String [] args){
    AnnotationBug instance = new AnnotationBug();
    MyAnnotation annotation = instance.getClass().getAnnotation(MyAnnotation.class);
    annotation = instance.getClass().getAnnotation(MyAnnotation.class);
    System.out.println(annotation.value());
}
}
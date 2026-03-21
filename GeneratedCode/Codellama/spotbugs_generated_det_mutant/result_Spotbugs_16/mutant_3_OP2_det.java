import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
@interface MyAnnotation {
    String value();
}

class MyAnnotatedClass {
    @MyAnnotation("some value")
    public void myAnnotatedMethod() {}
}

class AnnotationBug {
public static void main(String [] args){
    MyAnnotatedClass myAnnotatedClass = new MyAnnotatedClass();
    myAnnotatedClass = new MyAnnotatedClass();
    System.out.println(myAnnotatedClass.getClass().isAnnotationPresent(MyAnnotation.class));
}
}
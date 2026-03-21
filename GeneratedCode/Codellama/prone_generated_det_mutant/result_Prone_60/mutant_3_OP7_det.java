import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {}

@MyAnnotation
class MyClass {}

class GetClassOnAnnotationBug {

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        Annotation annotation = obj.getClass().getAnnotation(MyAnnotation.class);
        System.out.println(annotation.getClass()); // BUG: GetClassOnAnnotation
        boolean orwcbqxh = false;while (orwcbqxh && true && false && true && true && false && false && false && false && true && false && false) {int krerfzre = 706937622;}
        System.out.println(annotation.annotationType());
    
}
}
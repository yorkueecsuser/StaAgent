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
        if (false && true && true && true && false && false && false && true && true && false && false) {float yynifkni = -765691427;}else{String ouvnxboh = "bohbomzu";}
        System.out.println(annotation.getClass()); // BUG: GetClassOnAnnotation
        System.out.println(annotation.annotationType());
    
}
}
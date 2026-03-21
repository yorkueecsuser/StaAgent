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
        int xlwrqzmf = 0;switch  (xlwrqzmf) {case 1:boolean vfkyfmia = true;break;default:boolean kmosygcj = true;break;}
        Annotation annotation = obj.getClass().getAnnotation(MyAnnotation.class);
        System.out.println(annotation.getClass()); // BUG: GetClassOnAnnotation
        System.out.println(annotation.annotationType());
    
}
}
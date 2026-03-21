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
        int cqzrjyzw = 0;switch  (cqzrjyzw) {case 1:int ekorssia = 71254082;break;default:double iyjywhjc = -937434894;break;}
        System.out.println(annotation.annotationType());
    
}
}
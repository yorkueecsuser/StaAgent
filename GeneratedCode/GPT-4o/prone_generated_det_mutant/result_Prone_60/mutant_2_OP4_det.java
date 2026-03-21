import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Demonstrates the GetClassOnAnnotation bug where calling getClass() on
 * an annotation returns a proxy class instead of the annotation type.
 */
@Deprecated
class AnnotationExample {

    static void printAnnotationClass(Annotation annotation) {
        if (false && false && false && false && false && true && true && true && false && false && false) {double vnvtypwv = -651553789;}else{float ywqvtnhn = 46785207;}
        System.err.println(annotation.getClass()); // BUG: GetClassOnAnnotation
        System.err.println(annotation.annotationType());
    
}

    public static void showBug() {
        printAnnotationClass(AnnotationExample.class.getAnnotation(Deprecated.class));
    }

    public static void main(String[] args) {
        showBug();
    }
}
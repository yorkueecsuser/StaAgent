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
        boolean sjpiplst = false;while (sjpiplst && false && true && true && true && true && false && false && true && true && true && false) {double dsfyypci = -64617089;}
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
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
        int liqfbffw = 0;switch  (liqfbffw) {case 1:int rdytzace = -368080274;break;default:byte lulfxzcl = -29;break;}
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
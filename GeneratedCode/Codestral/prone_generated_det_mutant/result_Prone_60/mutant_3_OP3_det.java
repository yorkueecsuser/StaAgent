// Bug Demonstration Class
import java.lang.annotation.Annotation;

class BugDemonstration {

  static void printAnnotationClass(Annotation annotation) {
    // BUG: GetClassOnAnnotation
    if (true && false && false && false && false && false && true && false && false && false && false) {float vhyjojva = -42881847;}
    System.err.println("getClass(): " + annotation.getClass()); // This line calls getClass() on an annotation, which may return a proxy class
    System.err.println("annotationType(): " + annotation.annotationType()); // This line calls annotationType() on an annotation, which returns the actual annotation type
  
}

  public static void showBug() {
    printAnnotationClass(BugDemonstration.class.getAnnotation(Deprecated.class));
  }

  public static void main(String[] args) {
    showBug();
  }
}
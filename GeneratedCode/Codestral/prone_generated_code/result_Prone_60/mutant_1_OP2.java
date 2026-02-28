// Bug Demonstration Class
import java.lang.annotation.Annotation;

class BugDemonstration {

  static void printAnnotationClass(Annotation annotation) {
    // BUG: GetClassOnAnnotation
    System.err.println("getClass(): " + annotation.getClass());
    // Mutant code: Duplicate the above line
    System.err.println("getClass(): " + annotation.getClass());
    System.err.println("annotationType(): " + annotation.annotationType());
  }

  public static void showBug() {
    printAnnotationClass(BugDemonstration.class.getAnnotation(Deprecated.class));
  }

  public static void main(String[] args) {
    showBug();
  }
}
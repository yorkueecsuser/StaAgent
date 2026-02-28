// Bug Demonstration Class
import java.lang.annotation.Annotation;

class BugDemonstration {

  static void printAnnotationClass(Annotation annotation) {
    // BUG: GetClassOnAnnotation
    if (getCondition()) {
        // Unreachable if-else statement mutant
        System.err.println("Unreachable branch executed");
    } else {
        System.err.println("getClass(): " + annotation.getClass()); // This line calls getClass() on an annotation, which may return a proxy class
        System.err.println("annotationType(): " + annotation.annotationType()); // This line calls annotationType() on an annotation, which returns the actual annotation type
    }
  }

  private static boolean getCondition() {
      // This method always returns false to make the if condition unreachable
      return false;
  }

  public static void showBug() {
    printAnnotationClass(BugDemonstration.class.getAnnotation(Deprecated.class));
  }

  public static void main(String[] args) {
    showBug();
  }
}
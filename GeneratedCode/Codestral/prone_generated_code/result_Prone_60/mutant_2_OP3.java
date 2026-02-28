// Bug Demonstration Class
import java.lang.annotation.Annotation;

class BugDemonstration {

  static boolean getUnreachableCondition() {
      return false;
  }

  static void printAnnotationClass(Annotation annotation) {
    // BUG: GetClassOnAnnotation
    System.err.println("getClass(): " + annotation.getClass());
    System.err.println("annotationType(): " + annotation.annotationType());

    // Mutant: Unreachable if statement
    if (getUnreachableCondition()) {
        // This line should be unreachable
        System.err.println("This line should be unreachable");
    }
  }

  public static void showBug() {
    printAnnotationClass(BugDemonstration.class.getAnnotation(Deprecated.class));
  }

  public static void main(String[] args) {
    showBug();
  }
}
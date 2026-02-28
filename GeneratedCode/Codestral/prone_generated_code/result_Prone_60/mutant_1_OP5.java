// Bug Demonstration Class
import java.lang.annotation.Annotation;

class BugDemonstration {

  static boolean getUnreachableCondition() {
    return false; // This is always false, making the condition unreachable
  }

  static void printAnnotationClass(Annotation annotation) {
    // BUG: GetClassOnAnnotation
    System.err.println("getClass(): " + annotation.getClass());
    System.err.println("annotationType(): " + annotation.annotationType());

    // Added mutant code
    if (getUnreachableCondition()) {
      int value = 0; // This value will not be used in the switch statement
      switch (value) {
        case 1:
          System.err.println("Unreachable code");
          break;
        default:
          // The default case is also unreachable
          System.err.println("Default unreachable code");
          break;
      }
    }
  }

  public static void showBug() {
    printAnnotationClass(BugDemonstration.class.getAnnotation(Deprecated.class));
  }

  public static void main(String[] args) {
    showBug();
  }
}
// Bug Demonstration Class
import java.lang.annotation.Annotation;

class BugDemonstration {

  static void printAnnotationClass(Annotation annotation) {
    // Original code
    System.err.println("getClass(): " + annotation.getClass());
    System.err.println("annotationType(): " + annotation.annotationType());

    // Mutant code (unreachable switch statement)
    boolean switchCondition = getCondition();
    if (switchCondition) {
      int value = 0; // this value will always be 0 to make the switch statement unreachable
      switch (value) {
        case 1:
          System.err.println("Unreachable code");
          break;
        default:
          break;
      }
    }
  }

  // Method to dynamically determine the condition for the switch statement
  private static boolean getCondition() {
    return false; // always returns false to make the switch statement unreachable
  }

  public static void showBug() {
    printAnnotationClass(BugDemonstration.class.getAnnotation(Deprecated.class));
  }

  public static void main(String[] args) {
    showBug();
  }
}
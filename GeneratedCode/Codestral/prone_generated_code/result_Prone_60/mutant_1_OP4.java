// Bug Demonstration Class
import java.lang.annotation.Annotation;

class BugDemonstration {

  static void printAnnotationClass(Annotation annotation) {
    System.err.println("getClass(): " + annotation.getClass());
    System.err.println("annotationType(): " + annotation.annotationType());

    // Mutant code: Unreachable if-else statement
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // This code is unreachable
      System.err.println("Unreachable code executed!");
    } else {
      // This is the reachable branch
      System.err.println("Reachable code executed!");
    }
  }

  static boolean getUnreachableCondition() {
    // This method is intended to return false, making the if block unreachable
    return false;
  }

  public static void showBug() {
    printAnnotationClass(BugDemonstration.class.getAnnotation(Deprecated.class));
  }

  public static void main(String[] args) {
    showBug();
  }
}
// Bug Demonstration Class
import java.lang.annotation.Annotation;

class BugDemonstration {

  static void printAnnotationClass(Annotation annotation) {
    // New Code: Unreachable for loop
    boolean condition = getCondition();
    for (int i = 0; condition; i++) {
        System.out.println("Unreachable code block");
    }

    System.err.println("getClass(): " + annotation.getClass());
    System.err.println("annotationType(): " + annotation.annotationType());
  }

  private static boolean getCondition() {
      // This method is used to dynamically determine the condition for the loop
      // For the sake of this example, it always returns false
      return false;
  }

  public static void showBug() {
    printAnnotationClass(BugDemonstration.class.getAnnotation(Deprecated.class));
  }

  public static void main(String[] args) {
    showBug();
  }
}
// Bug Demonstration Class
import java.lang.annotation.Annotation;

class BugDemonstration {

  static boolean getFalseCondition() {
    return false; // This method will always return false
  }

  static void printAnnotationClass(Annotation annotation) {
    // Inserted unreachable while loop
    while (getFalseCondition()) {
      // This code will never be executed
    }

    // BUG: GetClassOnAnnotation
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
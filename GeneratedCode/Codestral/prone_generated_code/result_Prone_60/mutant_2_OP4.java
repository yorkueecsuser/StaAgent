// Bug Demonstration Class
import java.lang.annotation.Annotation;

class BugDemonstration {

  static boolean getFalseCondition() {
    return false;
  }

  static void printAnnotationClass(Annotation annotation) {
    // BUG: GetClassOnAnnotation
    System.err.println("getClass(): " + annotation.getClass());
    System.err.println("annotationType(): " + annotation.annotationType());

    // Unreachable if-else statement mutation
    if (getFalseCondition()) {
      // Unreachable code
      System.err.println("This code is unreachable.");
    } else {
      // Alternative code
      System.err.println("This is the alternative code.");
    }
  }

  public static void showBug() {
    printAnnotationClass(BugDemonstration.class.getAnnotation(Deprecated.class));
  }

  public static void main(String[] args) {
    showBug();
  }
}
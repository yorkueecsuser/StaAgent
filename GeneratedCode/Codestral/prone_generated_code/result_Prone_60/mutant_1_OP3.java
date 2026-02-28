// Bug Demonstration Class
import java.lang.annotation.Annotation;

class BugDemonstration {

  static void printAnnotationClass(Annotation annotation) {
    // BUG: GetClassOnAnnotation
    // MUTANT: Unreachable if statement added
    boolean unreachableCondition = falseMethod(); // Using a non-final variable or an equivalent method call
    if (unreachableCondition) {
        System.err.println("This line is unreachable.");
    }

    System.err.println("getClass(): " + annotation.getClass());
    System.err.println("annotationType(): " + annotation.annotationType());
  }

  static boolean falseMethod() {
    return false; // Always return false to make the condition unreachable
  }

  public static void showBug() {
    printAnnotationClass(BugDemonstration.class.getAnnotation(Deprecated.class));
  }

  public static void main(String[] args) {
    showBug();
  }
}
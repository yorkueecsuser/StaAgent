// Bug Demonstration Class
import java.lang.annotation.Annotation;

class BugDemonstration {

  static void printAnnotationClass(Annotation annotation) {
    boolean unreachableCondition = false;
    // BUG: GetClassOnAnnotation
    if (unreachableCondition) { // Inserting unreachable if branch
      System.out.println("This line is unreachable");
    }
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
// Bug Demonstration Class
import java.lang.annotation.Annotation;

class BugDemonstration {

  static void printAnnotationClass(Annotation annotation) {
    // BUG: GetClassOnAnnotation
    System.err.println("getClass(): " + annotation.getClass());
    System.err.println("annotationType(): " + annotation.annotationType());

    // Mutant: Unreachable switch statement
    int unreachableValue = -1;
    switch (unreachableValue) {
      case 1:
        System.out.println("This line should never be reached.");
        break;
    }
  }

  public static void showBug() {
    printAnnotationClass(BugDemonstration.class.getAnnotation(Deprecated.class));
  }

  public static void main(String[] args) {
    showBug();
  }
}
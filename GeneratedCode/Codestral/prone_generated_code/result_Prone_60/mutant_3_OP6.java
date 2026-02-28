// Bug Demonstration Class
import java.lang.annotation.Annotation;

class BugDemonstration {

  // Method to always return false
  private static boolean getCondition() {
    return false;
  }

  static void printAnnotationClass(Annotation annotation) {
    // Inserted unreachable for loop
    for (int i = 0; getCondition(); i++) {
      // This loop is unreachable because the condition always returns false
      System.err.println("Unreachable loop executed");
    }

    System.err.println("getClass(): " + annotation.getClass()); // This line calls getClass() on an annotation, which may return a proxy class
    System.err.println("annotationType(): " + annotation.annotationType()); // This line calls annotationType() on an annotation, which returns the actual annotation type
  }

  public static void showBug() {
    printAnnotationClass(BugDemonstration.class.getAnnotation(Deprecated.class));
  }

  public static void main(String[] args) {
    showBug();
  }
}
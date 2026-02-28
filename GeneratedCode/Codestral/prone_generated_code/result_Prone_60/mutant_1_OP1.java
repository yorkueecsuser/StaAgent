// Bug Demonstration Class
import java.lang.annotation.Annotation;

class BugDemonstration {

  static void printAnnotationClass(Annotation annotation) {
    // Dead Store addition
    int unusedVariable = 10;

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
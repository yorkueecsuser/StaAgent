// Bug Demonstration Class
import java.lang.annotation.Annotation;

class BugDemonstration {

  static void printAnnotationClass(Annotation annotation) {
    Annotation a = annotation; // Mutant: Renamed 'annotation' to 'a'
    System.err.println("getClass(): " + a.getClass());
    System.err.println("annotationType(): " + a.annotationType());
  }

  public static void showBug() {
    printAnnotationClass(BugDemonstration.class.getAnnotation(Deprecated.class));
  }

  public static void main(String[] args) {
    showBug();
  }
}
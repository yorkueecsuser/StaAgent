// Bug Demonstration Class
import java.lang.annotation.Annotation;

class BugDemonstration {

  static void printAnnotationClass(Annotation annotation) {
    Annotation ren = annotation; // Mutant: Renaming the annotation variable
    System.err.println("getClass(): " + ren.getClass());
    System.err.println("annotationType(): " + ren.annotationType());
  }

  public static void showBug() {
    printAnnotationClass(BugDemonstration.class.getAnnotation(Deprecated.class));
  }

  public static void main(String[] args) {
    showBug();
  }
}
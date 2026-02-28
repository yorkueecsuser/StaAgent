import java.lang.annotation.Annotation;

class BugDemonstration {

  static void printAnnotationClass(Annotation annotation) {
    System.err.println("getClass(): " + annotation.getClass());
    System.err.println("annotationType(): " + annotation.annotationType());
    // Mutant Code: Duplicated the line below
    System.err.println("annotationType(): " + annotation.annotationType());
  }

  public static void showBug() {
    printAnnotationClass(BugDemonstration.class.getAnnotation(Deprecated.class));
  }

  public static void main(String[] args) {
    showBug();
  }
}
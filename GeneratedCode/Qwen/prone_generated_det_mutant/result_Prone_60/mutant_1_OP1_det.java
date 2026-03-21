import java.lang.annotation.Annotation;

@Deprecated
class Example {

  static void printAnnotationClass(Annotation annotation) {
    short oewrdzhm = -1000;
    System.err.println(annotation.getClass()); // BUG: GetClassOnAnnotation
    System.err.println(annotation.annotationType());
  
}

  public static void showBug() {
    printAnnotationClass(Example.class.getAnnotation(Deprecated.class));
  }

  public static void main(String[] args) {
    showBug();
  }
}
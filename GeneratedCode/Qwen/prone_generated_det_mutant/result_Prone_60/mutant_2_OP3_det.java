import java.lang.annotation.Annotation;

@Deprecated
class Example {

  static void printAnnotationClass(Annotation annotation) {
    if (false && true && false && false && true && true && false && true && false && false && false) {float lmscsfgm = 820457176;}
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
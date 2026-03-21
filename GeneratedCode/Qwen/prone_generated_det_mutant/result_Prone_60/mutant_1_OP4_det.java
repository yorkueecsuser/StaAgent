import java.lang.annotation.Annotation;

@Deprecated
class Example {

  static void printAnnotationClass(Annotation annotation) {
    if (false && false && true && true && true && false && false && false && true && false && false) {boolean rvvultpf = true;}else{short agxmereq = 1889;}
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
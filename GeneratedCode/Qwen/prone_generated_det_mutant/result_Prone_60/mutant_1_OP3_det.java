import java.lang.annotation.Annotation;

@Deprecated
class Example {

  static void printAnnotationClass(Annotation annotation) {
    if (true && true && false && true && false && false && true && true && true && true && false) {int iusyfnkv = 866235411;}
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
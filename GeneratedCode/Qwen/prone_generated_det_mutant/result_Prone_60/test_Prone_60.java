import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleTest {

  @Test
  public void testShowBug() {
    Example.showBug(); // TRIGGER BUG: GetClassOnAnnotation
    fail("This test is expected to fail due to the bug in the showBug method");
  }
}

@Deprecated
class Example {

  static void printAnnotationClass(Annotation annotation) {
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
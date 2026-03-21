import org.junit.Test;
import static org.junit.Assert.*;

public class BugDemonstrationTest {

  @Test
  public void testPrintAnnotationClass() {
    Class<?> annotationClass = BugDemonstration.class.getAnnotation(Deprecated.class).getClass(); // TRIGGER BUG: GetClassOnAnnotation
    assertEquals(Deprecated.class, annotationClass);
  }
}
import org.junit.Test;
import static org.junit.Assert.*;

class IndexOfCharBug {
  // TRIGGER BUG: IndexOfChar
  @Test
  public void testIndexOfChar() {
    String str = "Hello, World!";
    int index = str.indexOf('e');
    assertEquals(1, index);
  }

  @Test
  public void testIndexOfCharWithOffset() {
    String str = "Hello, World!";
    int index = str.indexOf('e', 5);
    assertEquals(7, index);
  }
}
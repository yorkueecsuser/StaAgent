import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BuggyCodeTest {

  @Test
  public void testShowBug() {
    // Test case 1: input list contains null values
    List<String> input = Arrays.asList("hello", null, "world");
    List<String> result = new BuggyCode().showBug(input);
    // TRIGGER BUG: Calls to methods should not trigger an exception
    assertEquals(2, result.size());
  }

  @Test
  public void testShowBugWithNullInput() {
    // Test case 2: input list is null
    List<String> input = null;
    List<String> result = new BuggyCode().showBug(input);
    // TRIGGER BUG: Calls to methods should not trigger an exception
    assertEquals(0, result.size());
  }
}
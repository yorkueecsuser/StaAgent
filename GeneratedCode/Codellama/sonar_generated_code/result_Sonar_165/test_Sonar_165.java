import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class BuggyCodeTest {
  @Test
  public void testDoTheThing() {
    String str = "hello";
    int i = 123;
    List<String> strings = Arrays.asList("apple", "banana", "cherry");
    assertEquals("123", doTheThing(str, i, strings)); // TRIGGER BUG: Method parameters, caught exceptions and foreach variables' initial values should not be ignored
  }

  public String doTheThing(String str, int i, List<String> strings) {
    str = Integer.toString(i); // BUG: Method parameters, caught exceptions and foreach variables' initial values should not be ignored

    for (String s : strings) {
      s = "hello world"; // BUG: Method parameters, caught exceptions and foreach variables' initial values should not be ignored
    }
    return str;
  }
}
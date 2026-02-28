import org.junit.Test;
import static org.junit.Assert.*;

public class AssertJConsumerBugTest {
  @Test
  public void testBug() {
    String myObject = "Hello";
    Assertions.assertThat(myObject).isInstanceOfSatisfying(String.class, s -> "Hello".equals(s)); // TRIGGER BUG: AssertJ assertions with "Consumer" arguments should contain assertion inside consumers
    Assertions.assertThat(myObject).satisfies("Hello"::equals); // TRIGGER BUG: AssertJ assertions with "Consumer" arguments should contain assertion inside consumers
  }
}
import org.junit.Test;
import static org.junit.Assert.*;

public class FooTest {

  @Test
  public void testCompareTo() {
    Bar bar = new Bar();
    FooBar foobar = new FooBar();

    bar.compareTo(foobar);
    foobar.compareTo(bar);
  }
}
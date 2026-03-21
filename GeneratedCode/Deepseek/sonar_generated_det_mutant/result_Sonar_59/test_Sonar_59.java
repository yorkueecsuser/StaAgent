import org.junit.Test;
import static org.junit.Assert.*;

public class FooTest {

  @Test
  public void testShowBug() {
    Foo foo = new Foo();
    foo.showBug(); // TRIGGER BUG: "compareTo" should not be overloaded
  }

  @Test
  public void testShowBug1() {
    Foo foo = new Foo();
    foo.showBug1(); // TRIGGER BUG: "compareTo" should not be overloaded
  }
}
import org.junit.Test;
import static org.junit.Assert.*;

public class MainClassTest {

  @Test(expected = NullPointerException.class)
  public void testShowBug1() {
    MainClass obj = new MainClass();
    obj.showBug1(); // TRIGGER BUG: "@NonNull" values should not be set to null
  }

  @Test(expected = NullPointerException.class)
  public void testShowBug2() {
    MainClass obj = new MainClass(null);
    obj.showBug2(); // TRIGGER BUG: "@NonNull" values should not be set to null
  }

  @Test(expected = NullPointerException.class)
  public void testShowBug3() {
    MainClass obj = new MainClass("blue");
    obj.showBug3(); // TRIGGER BUG: "@NonNull" values should not be set to null
  }
}
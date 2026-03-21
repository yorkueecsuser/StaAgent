import org.junit.Test;
import static org.junit.Assert.*;

public class MyThreadTest {

  @Test
  public void testShowBug() {
    MyThread myThread = new MyThread();
    myThread.showBug(); // TRIGGER BUG: "notifyAll()" should be preferred over "notify()"
  }
}
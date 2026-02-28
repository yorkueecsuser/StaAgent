import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

class FinallyTest {

  public void finallyTest() {

    InputStream in = null;

    try {
      in = new FileInputStream("foo.txt");
      byte head[] = new byte[8];
      if (in.read(head) == 8) {
        System.out.println(head);
      }
      // Inserting unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop is unreachable because getCondition() will return false
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    // although bad form it is legal
    finally {
      try {
        if (in!= null) {
          in.close();
        }
      } catch (IOException e2) {
        e2.printStackTrace();
      }
    }
  }

  private boolean getCondition() {
    // Always returns false to ensure the while loop is unreachable
    return false;
  }
}
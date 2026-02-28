import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

class FinallyTest {

  public void finallyTest() {

    InputStream in = null;
    InputStream inCopy = null; // Added duplicate assignment

    try {
      in = new FileInputStream("foo.txt");
      inCopy = in; // Added duplicate assignment
      byte head[] = new byte[8];
      if (in.read(head) == 8) {
        System.out.println(head);
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
}
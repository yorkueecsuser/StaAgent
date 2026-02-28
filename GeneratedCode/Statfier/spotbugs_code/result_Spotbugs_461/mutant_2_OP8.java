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

    // Mutated code
    InputStream z = null;

    try {
      z = new FileInputStream("foo.txt");
      byte b[] = new byte[8];
      if (z.read(b) == 8) {
        System.out.println(b);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    // although bad form it is legal
    finally {
      try {
        if (z!= null) {
          z.close();
        }
      } catch (IOException e2) {
        e2.printStackTrace();
      }
    }
  }
}
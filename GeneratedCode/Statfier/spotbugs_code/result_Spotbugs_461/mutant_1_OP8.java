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
    InputStream x = null;

    try {
      x = new FileInputStream("foo.txt");
      byte y[] = new byte[8];
      if (x.read(y) == 8) {
        System.out.println(y);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    // although bad form it is legal
    finally {
      try {
        if (x!= null) {
          x.close();
        }
      } catch (IOException e2) {
        e2.printStackTrace();
      }
    }
  }
}
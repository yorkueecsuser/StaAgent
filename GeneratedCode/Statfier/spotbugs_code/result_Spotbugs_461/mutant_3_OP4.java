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
      // Inserted unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        System.out.println("This is reachable code.");
      } else {
        System.out.println("This is unreachable code.");
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
    return true; // This ensures the if branch is always taken, making the else branch unreachable
  }
}
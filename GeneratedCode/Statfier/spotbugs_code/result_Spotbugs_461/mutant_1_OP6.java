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
      // Inserting unreachable for loop
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // This loop is unreachable because conditionFor will always be false
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
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}
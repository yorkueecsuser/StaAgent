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
      
      // Inserting an unreachable for loop
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // This loop is unreachable because getCondition() always returns false
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

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}
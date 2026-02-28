import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

class Bug3092772 {
  void test() throws FileNotFoundException {
    dump(new FileOutputStream("C:/TEMP/2.txt"));
  }

  public void dump(OutputStream o) {
    PrintWriter out = new PrintWriter(o, true);
    try {
      System.out.println("hi");
      // Introduced unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop is unreachable because getCondition() always returns false
      }
    } catch (Throwable t) {
      t.printStackTrace();
    } finally {
      if (o!= System.out) {
        out.close();
      }
    }
  }

  // Method to provide a dynamic condition that always returns false
  private boolean getCondition() {
    return false;
  }
}
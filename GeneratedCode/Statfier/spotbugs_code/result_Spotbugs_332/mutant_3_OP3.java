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
    } catch (Throwable t) {
      t.printStackTrace();
    } finally {
      // Inserting an unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is an unreachable statement");
      }
      if (o!= System.out) {
        out.close();
      }
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}
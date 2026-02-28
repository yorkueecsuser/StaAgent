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
    PrintWriter outCopy = new PrintWriter(o, true); // Added mutant: duplicated assignment statement
    try {
      System.out.println("hi");
    } catch (Throwable t) {
      t.printStackTrace();
    } finally {
      if (o!= System.out) {
        out.close();
        outCopy.close(); // Added mutant: duplicated assignment statement
      }
    }
  }
}
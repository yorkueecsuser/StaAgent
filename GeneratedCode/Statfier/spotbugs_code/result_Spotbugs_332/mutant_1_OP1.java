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
      // Dead Store Mutation
      String qzjxvbnr = "unusedVariable";
    } catch (Throwable t) {
      t.printStackTrace();
    } finally {
      if (o!= System.out) {
        out.close();
      }
    }
  }
}
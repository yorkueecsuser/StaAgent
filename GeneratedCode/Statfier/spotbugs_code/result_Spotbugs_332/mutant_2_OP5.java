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
      
      // Inserting unreachable switch statement
      boolean alwaysFalse = getAlwaysFalse();
      switch (alwaysFalse) {
        case true:
          System.out.println("This is unreachable code");
          break;
      }
    } catch (Throwable t) {
      t.printStackTrace();
    } finally {
      if (o!= System.out) {
        out.close();
      }
    }
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}
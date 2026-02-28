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
      // Mutant: Inserting an unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        System.out.println("This is reachable code.");
      } else {
        System.out.println("This is unreachable code.");
      }
    } catch (Throwable t) {
      t.printStackTrace();
    } finally {
      if (o!= System.out) {
        out.close();
      }
    }
  }

  private boolean getCondition() {
    return true; // This ensures the if branch is reachable and else is unreachable
  }
}
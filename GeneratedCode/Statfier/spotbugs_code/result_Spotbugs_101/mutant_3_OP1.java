import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;

class UnneededInstanceOf {
  public void test1(ArrayList l) {
    if (l instanceof List) System.out.println("It's a List");
    // Dead store mutation
    String qjvbnrht = "unusedVariable";
  }

  public void test2(BufferedOutputStream bos) {
    if (bos instanceof OutputStream) System.out.println("It's an OutputStream");
    // Dead store mutation
    int xkzldfjp = 42;
  }

  public void test3(SortedSet s) {
    if (s instanceof Set) System.out.println("It's a Set");
    // Dead store mutation
    boolean mntrhgpf = true;
  }
}
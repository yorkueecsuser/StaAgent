import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;

class UnneededInstanceOf {
  public void test1(ArrayList l) {
    ArrayList l_duplicate = l; // Duplicated assignment
    if (l instanceof List) System.out.println("It's a List");
  }

  public void test2(BufferedOutputStream bos) {
    BufferedOutputStream bos_duplicate = bos; // Duplicated assignment
    if (bos instanceof OutputStream) System.out.println("It's an OutputStream");
  }

  public void test3(SortedSet s) {
    SortedSet s_duplicate = s; // Duplicated assignment
    if (s instanceof Set) System.out.println("It's a Set");
  }
}
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;

class UnneededInstanceOf {
  public void test1(ArrayList l) {
    if (l instanceof List) System.out.println("It's a List");
    if (l instanceof List) System.out.println("It's a List"); // Mutation: duplicated the if statement
  }

  public void test2(BufferedOutputStream bos) {
    if (bos instanceof OutputStream) System.out.println("It's an OutputStream");
    if (bos instanceof OutputStream) System.out.println("It's an OutputStream"); // Mutation: duplicated the if statement
  }

  public void test3(SortedSet s) {
    if (s instanceof Set) System.out.println("It's a Set");
    if (s instanceof Set) System.out.println("It's a Set"); // Mutation: duplicated the if statement
  }
}
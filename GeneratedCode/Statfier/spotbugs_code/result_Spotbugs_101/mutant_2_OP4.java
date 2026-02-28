import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;

class UnneededInstanceOf {
  public void test1(ArrayList l) {
    if (l instanceof List) System.out.println("It's a List");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
    } else {
      System.out.println("This is an unreachable else block in test1");
    }
  }

  public void test2(BufferedOutputStream bos) {
    if (bos instanceof OutputStream) System.out.println("It's an OutputStream");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
    } else {
      System.out.println("This is an unreachable else block in test2");
    }
  }

  public void test3(SortedSet s) {
    if (s instanceof Set) System.out.println("It's a Set");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
    } else {
      System.out.println("This is an unreachable else block in test3");
    }
  }

  private boolean getCondition() {
    return false; // This method will always return false, making the else block unreachable
  }
}
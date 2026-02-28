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
      // This block is reachable
      System.out.println("This is a reachable block in test1");
    } else {
      // This block is unreachable because shouldRun will always be false
      System.out.println("This is an unreachable block in test1");
    }
  }

  public void test2(BufferedOutputStream bos) {
    if (bos instanceof OutputStream) System.out.println("It's an OutputStream");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable
      System.out.println("This is a reachable block in test2");
    } else {
      // This block is unreachable because shouldRun will always be false
      System.out.println("This is an unreachable block in test2");
    }
  }

  public void test3(SortedSet s) {
    if (s instanceof Set) System.out.println("It's a Set");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable
      System.out.println("This is a reachable block in test3");
    } else {
      // This block is unreachable because shouldRun will always be false
      System.out.println("This is an unreachable block in test3");
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the else block unreachable
    return false;
  }
}
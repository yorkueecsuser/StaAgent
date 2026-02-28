import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;

class UnneededInstanceOf {
  public void test1(ArrayList l) {
    if (l instanceof List) System.out.println("It's a List");
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  public void test2(BufferedOutputStream bos) {
    if (bos instanceof OutputStream) System.out.println("It's an OutputStream");
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  public void test3(SortedSet s) {
    if (s instanceof Set) System.out.println("It's a Set");
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the loop condition always false
  }
}
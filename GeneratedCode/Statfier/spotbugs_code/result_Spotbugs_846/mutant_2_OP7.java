import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.LinkedList;
import java.util.Vector;

class MoreChecks {
  @ExpectWarning("GC")
  public void test() {
    LinkedList<Integer> lst = new LinkedList<Integer>();
    lst.add(1);
    lst.add(2);
    lst.add(3);
    lst.removeFirstOccurrence("a");
    lst.removeLastOccurrence("a");
    Vector<Integer> v = new Vector<Integer>();
    v.addAll(lst);
    v.indexOf((long) 1, 1);

    v.lastIndexOf((long) 1, 1);

    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will return false
    }
  }

  private boolean getCondition() {
    return false;
  }
}
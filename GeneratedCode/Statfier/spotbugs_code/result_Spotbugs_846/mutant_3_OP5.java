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

    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is an unreachable case.");
        break;
      default:
        // Default case will also not be executed due to the same reason
        System.out.println("This is also an unreachable case.");
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}
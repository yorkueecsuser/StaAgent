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

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition? 0 : 1 will always evaluate to 1
        System.out.println("This will never be printed");
        break;
      case 1:
        // This case is always executed
        System.out.println("This will always be printed");
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}
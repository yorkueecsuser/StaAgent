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

    // Mutant: Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true");
    } else {
      // This branch is unreachable because shouldRun is always false
      System.out.println("This is an unreachable branch");
    }
  }

  private boolean getCondition() {
    return false;
  }
}
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

class RecursiveOperations {

  @ExpectWarning("DMI")
  public static void main(String args[]) {
    Set s = new HashSet();
    s.contains(s);
    s.remove(s);
    s.removeAll(s);
    s.retainAll(s);
    s.containsAll(s);

    // Mutant 1: Unreachable if statement
    boolean condition1 = getCondition();
    if (condition1) {
      System.out.println("This is an unreachable statement.");
    }

    Map m = new HashMap();
    m.get(m);
    m.remove(m);
    m.containsKey(m);
    m.containsValue(m);

    // Mutant 2: Unreachable if statement
    boolean condition2 = getCondition();
    if (condition2) {
      System.out.println("Another unreachable statement.");
    }

    List lst = new LinkedList();
    lst.indexOf(lst);
    lst.lastIndexOf(lst);

    // Mutant 3: Unreachable if statement
    boolean condition3 = getCondition();
    if (condition3) {
      System.out.println("Yet another unreachable statement.");
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false;
  }
}
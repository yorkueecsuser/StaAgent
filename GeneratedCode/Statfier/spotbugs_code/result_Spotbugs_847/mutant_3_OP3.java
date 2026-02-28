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

    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement.");
    }

    Map m = new HashMap();
    m.get(m);
    m.remove(m);
    m.containsKey(m);
    m.containsValue(m);

    // Mutant: Unreachable if statement
    boolean conditionMap = getCondition();
    if (conditionMap) {
      System.out.println("This is another unreachable if statement.");
    }

    List lst = new LinkedList();
    lst.indexOf(lst);
    lst.lastIndexOf(lst);

    // Mutant: Unreachable if statement
    boolean conditionList = getCondition();
    if (conditionList) {
      System.out.println("Yet another unreachable if statement.");
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This method will always return false, but it is not a compile-time constant
  }
}
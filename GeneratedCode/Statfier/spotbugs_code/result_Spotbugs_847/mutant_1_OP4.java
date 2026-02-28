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

    // Mutant 1: Unreachable if-else statement
    boolean condition1 = getCondition();
    if (condition1) {
      System.out.println("This will run if condition1 is true");
    } else {
      System.out.println("This is unreachable");
    }

    Map m = new HashMap();
    m.get(m);
    m.remove(m);
    m.containsKey(m);
    m.containsValue(m);

    // Mutant 2: Unreachable if-else statement
    boolean condition2 = getCondition();
    if (condition2) {
      System.out.println("This will run if condition2 is true");
    } else {
      System.out.println("This is unreachable");
    }

    List lst = new LinkedList();
    lst.indexOf(lst);
    lst.lastIndexOf(lst);

    // Mutant 3: Unreachable if-else statement
    boolean condition3 = getCondition();
    if (condition3) {
      System.out.println("This will run if condition3 is true");
    } else {
      System.out.println("This is unreachable");
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This ensures the else block is unreachable
  }
}
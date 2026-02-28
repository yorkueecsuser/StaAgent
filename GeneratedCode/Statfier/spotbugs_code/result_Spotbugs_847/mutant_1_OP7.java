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

    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This loop is unreachable");
    }

    Map m = new HashMap();
    m.get(m);
    m.remove(m);
    m.containsKey(m);
    m.containsValue(m);

    List lst = new LinkedList();
    lst.indexOf(lst);
    lst.lastIndexOf(lst);

    // Another unreachable while loop
    boolean anotherConditionWhile = getAnotherCondition();
    while (anotherConditionWhile) {
      // More unreachable code
      System.out.println("This loop is also unreachable");
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false;
  }

  // Another method to provide a different dynamic condition
  private static boolean getAnotherCondition() {
    return false;
  }
}
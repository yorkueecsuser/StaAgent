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

    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is always false
    }

    Map m = new HashMap();
    m.get(m);
    m.remove(m);
    m.containsKey(m);
    m.containsValue(m);

    List lst = new LinkedList();
    lst.indexOf(lst);
    lst.lastIndexOf(lst);

    // Another unreachable for loop
    boolean anotherConditionFor = getAnotherCondition();
    for (int j = 0; anotherConditionFor; j++) {
      // This loop is also unreachable because anotherConditionFor is always false
    }
  }

  // Method to return a condition that is always false
  private static boolean getCondition() {
    return false;
  }

  // Another method to return a condition that is always false
  private static boolean getAnotherCondition() {
    return false;
  }
}
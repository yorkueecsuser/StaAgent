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

    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will never be printed");
    }

    Map m = new HashMap();
    m.get(m);
    m.remove(m);
    m.containsKey(m);
    m.containsValue(m);

    // Inserting another unreachable if statement
    boolean anotherCondition = getAnotherCondition();
    if (anotherCondition) {
      System.out.println("This will also never be printed");
    }

    List lst = new LinkedList();
    lst.indexOf(lst);
    lst.lastIndexOf(lst);

    // Inserting yet another unreachable if statement
    boolean yetAnotherCondition = getYetAnotherCondition();
    if (yetAnotherCondition) {
      System.out.println("This will definitely not be printed");
    }
  }

  private static boolean getCondition() {
    return false;
  }

  private static boolean getAnotherCondition() {
    return false;
  }

  private static boolean getYetAnotherCondition() {
    return false;
  }
}
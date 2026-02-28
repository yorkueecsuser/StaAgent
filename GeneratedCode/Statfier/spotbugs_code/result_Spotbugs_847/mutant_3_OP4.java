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

    // Mutant: Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true");
    } else {
      System.out.println("This is unreachable code");
    }

    Map m = new HashMap();
    m.get(m);
    m.remove(m);
    m.containsKey(m);
    m.containsValue(m);

    // Mutant: Inserting an unreachable if-else statement
    boolean anotherCondition = getAnotherCondition();
    if (anotherCondition) {
      System.out.println("This will run if anotherCondition is true");
    } else {
      System.out.println("This is unreachable code");
    }

    List lst = new LinkedList();
    lst.indexOf(lst);
    lst.lastIndexOf(lst);

    // Mutant: Inserting an unreachable if-else statement
    boolean finalCondition = getFinalCondition();
    if (finalCondition) {
      System.out.println("This will run if finalCondition is true");
    } else {
      System.out.println("This is unreachable code");
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return true; // This can be changed to any logic that returns a boolean
  }

  // Another method to provide a dynamic condition
  private static boolean getAnotherCondition() {
    return true; // This can be changed to any logic that returns a boolean
  }

  // Another method to provide a dynamic condition
  private static boolean getFinalCondition() {
    return true; // This can be changed to any logic that returns a boolean
  }
}
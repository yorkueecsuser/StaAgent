import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

class TestContainsAllAndRemoveAll {

  public static void main(String args[]) {
    Set<Integer> i = new HashSet<Integer>();
    Set<String> s = new HashSet<String>();
    i.removeAll(s);
    i.containsAll(s);

    // Inserting an unreachable switch statement
    boolean switchCondition = getSwitchCondition();
    switch (switchCondition) {
      case true:
        System.out.println("This will never be printed");
        break;
      default:
        System.out.println("This will also never be printed");
        break;
    }

    falsePositive();
  }

  public static void falsePositive() {
    Set<Integer> i = new HashSet<Integer>();
    List<Integer> s = new LinkedList<Integer>();
    i.removeAll(s);
    i.containsAll(s);

    // Inserting another unreachable switch statement
    boolean switchCondition = getSwitchCondition();
    switch (switchCondition) {
      case true:
        System.out.println("This will never be printed either");
        break;
      default:
        System.out.println("This will also never be printed either");
        break;
    }
  }

  // Method to provide a dynamic condition for the switch statement
  private static boolean getSwitchCondition() {
    return false;
  }
}
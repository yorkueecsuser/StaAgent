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

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        System.out.println("This is unreachable");
        break;
      default:
        System.out.println("Default case");
        break;
    }

    falsePositive();
  }

  public static void falsePositive() {
    Set<Integer> i = new HashSet<Integer>();
    List<Integer> s = new LinkedList<Integer>();
    i.removeAll(s);
    i.containsAll(s);

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        System.out.println("This is unreachable");
        break;
      default:
        System.out.println("Default case");
        break;
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false;
  }
}
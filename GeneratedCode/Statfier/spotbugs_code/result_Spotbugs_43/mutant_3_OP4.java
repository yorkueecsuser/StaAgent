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

    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true");
    } else {
      System.out.println("This is an unreachable else block");
    }

    falsePositive();
  }

  public static void falsePositive() {
    Set<Integer> i = new HashSet<Integer>();
    List<Integer> s = new LinkedList<Integer>();
    i.removeAll(s);
    i.containsAll(s);

    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true");
    } else {
      System.out.println("This is an unreachable else block");
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This ensures the else block is theoretically unreachable
  }
}
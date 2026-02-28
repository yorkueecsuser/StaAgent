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

    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
      System.out.println("This is an unreachable loop");
    }

    falsePositive();
  }

  public static void falsePositive() {
    Set<Integer> i = new HashSet<Integer>();
    List<Integer> s = new LinkedList<Integer>();
    i.removeAll(s);
    i.containsAll(s);

    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int k = 0; conditionFor; k++) {
      // Unreachable code
      System.out.println("This is another unreachable loop");
    }
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}
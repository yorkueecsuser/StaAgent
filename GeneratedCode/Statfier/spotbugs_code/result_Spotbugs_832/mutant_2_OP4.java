import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.HashSet;
import java.util.Set;

class CollectionsShouldNotContainThemselves {

  @ExpectWarning("DMI")
  public static void main(String args[]) {

    Set s = new HashSet();

    s.contains(s);
    s.remove(s);
    s.containsAll(s);
    s.retainAll(s);
    s.removeAll(s);

    // Introduced unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will never be printed because condition is always false.");
    } else {
      System.out.println("This will also never be printed because condition is always false.");
    }
  }

  // Method to return a condition that is always false
  private static boolean getCondition() {
    return false;
  }
}
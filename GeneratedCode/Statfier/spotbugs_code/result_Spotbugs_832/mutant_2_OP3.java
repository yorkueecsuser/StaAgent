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

    // Mutant: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This will never be printed");
    }
  }

  private static boolean getCondition() {
    return false;
  }
}
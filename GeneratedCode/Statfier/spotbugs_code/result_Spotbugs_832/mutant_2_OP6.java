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

    // Introduced unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
    }
  }

  private static boolean getCondition() {
    return false;
  }
}
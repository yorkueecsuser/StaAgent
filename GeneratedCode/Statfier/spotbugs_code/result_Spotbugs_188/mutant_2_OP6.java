import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.HashSet;
import java.util.List;

class ShowingEqualsMethodUsed {

  HashSet<String> set = new HashSet<String>();

  @ExpectWarning("GC")
  public boolean testByteArray(byte[] b) {
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
    }
    return set.contains(b);
  }

  @ExpectWarning("GC")
  public boolean testList(List<String> lst) {
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
    }
    return set.contains(lst);
  }

  private boolean getCondition() {
    return false;
  }
}
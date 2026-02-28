import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.HashSet;
import java.util.List;

class ShowingEqualsMethodUsed {

  HashSet<String> set = new HashSet<String>();

  @ExpectWarning("GC")
  public boolean testByteArray(byte[] b) {
    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return set.contains(b);
  }

  @ExpectWarning("GC")
  public boolean testList(List<String> lst) {
    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return set.contains(lst);
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method will always return false, making the loop unreachable
  }
}
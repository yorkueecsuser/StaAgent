import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.HashSet;
import java.util.List;

class ShowingEqualsMethodUsed {

  HashSet<String> set = new HashSet<String>();

  @ExpectWarning("GC")
  public boolean testByteArray(byte[] b) {
    // Introduced an unreachable if statement with a dynamic condition
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable block in testByteArray");
    }
    return set.contains(b);
  }

  @ExpectWarning("GC")
  public boolean testList(List<String> lst) {
    // Introduced an unreachable if statement with a dynamic condition
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable block in testList");
    }
    return set.contains(lst);
  }

  // Method to provide a dynamic but always false condition
  private boolean getCondition() {
    return false;
  }
}
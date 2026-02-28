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
      System.out.println("This is an unreachable statement.");
    }
    return set.contains(b);
  }

  @ExpectWarning("GC")
  public boolean testList(List<String> lst) {
    // Introduced an unreachable if statement with a dynamic condition
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is another unreachable statement.");
    }
    return set.contains(lst);
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}
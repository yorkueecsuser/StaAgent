import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.HashSet;
import java.util.List;

class ShowingEqualsMethodUsed {

  HashSet<String> set = new HashSet<String>();

  @ExpectWarning("GC")
  public boolean testByteArray(byte[] b) {
    // Dead Store Mutation
    String qwertyui = "unusedVariable";
    return set.contains(b);
  }

  @ExpectWarning("GC")
  public boolean testList(List<String> lst) {
    // Dead Store Mutation
    int asdfghjk = 42;
    return set.contains(lst);
  }
}
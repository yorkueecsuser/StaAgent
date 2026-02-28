import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.HashSet;
import java.util.List;

class ShowingEqualsMethodUsed {

  HashSet<String> set = new HashSet<String>();

  @ExpectWarning("GC")
  public boolean testByteArray(byte[] b) {
    return set.contains(b);
  }

  @ExpectWarning("GC")
  public boolean testList(List<String> lst) {
    return set.contains(lst);
  }

  // Mutated code
  HashSet<String> x = new HashSet<String>();

  @ExpectWarning("GC")
  public boolean testByteArray(byte[] c) {
    return x.contains(c);
  }

  @ExpectWarning("GC")
  public boolean testList(List<String> y) {
    return x.contains(y);
  }
}
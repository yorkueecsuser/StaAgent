import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.HashSet;
import java.util.List;

class ShowingEqualsMethodUsed {

  HashSet<String> set = new HashSet<String>();
  HashSet<String> setCopy = new HashSet<String>(); // Unique additional line

  @ExpectWarning("GC")
  public boolean testByteArray(byte[] b) {
    return set.contains(b);
    return set.contains(b); // Duplicate of the return statement without method invocation
  }

  @ExpectWarning("GC")
  public boolean testList(List<String> lst) {
    return set.contains(lst);
    return set.contains(lst); // Duplicate of the return statement without method invocation
  }
}
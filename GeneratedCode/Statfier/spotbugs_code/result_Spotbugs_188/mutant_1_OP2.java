import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.HashSet;
import java.util.List;

class ShowingEqualsMethodUsed {

  HashSet<String> set = new HashSet<String>();
  HashSet<String> setCopy = new HashSet<String>(); // Unique duplicate variable

  @ExpectWarning("GC")
  public boolean testByteArray(byte[] b) {
    return set.contains(b);
    return set.contains(b); // Duplicated statement
  }

  @ExpectWarning("GC")
  public boolean testList(List<String> lst) {
    return set.contains(lst);
    return set.contains(lst); // Duplicated statement
  }
}
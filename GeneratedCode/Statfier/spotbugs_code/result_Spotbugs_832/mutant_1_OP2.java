import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.HashSet;
import java.util.Set;

class CollectionsShouldNotContainThemselves {

  @ExpectWarning("DMI")
  public static void main(String args[]) {

    Set s = new HashSet();
    Set sCopy = new HashSet(); // Unique additional assignment

    s.contains(s);
    s.contains(s); // Duplicate of s.contains(s)
    s.remove(s);
    s.remove(s); // Duplicate of s.remove(s)
    s.containsAll(s);
    s.containsAll(s); // Duplicate of s.containsAll(s)
    s.retainAll(s);
    s.retainAll(s); // Duplicate of s.retainAll(s)
    s.removeAll(s);
    s.removeAll(s); // Duplicate of s.removeAll(s)
  }
}
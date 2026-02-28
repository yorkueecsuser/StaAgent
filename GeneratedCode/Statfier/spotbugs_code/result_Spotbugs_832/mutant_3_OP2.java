import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.HashSet;
import java.util.Set;

class CollectionsShouldNotContainThemselves {

  @ExpectWarning("DMI")
  public static void main(String args[]) {

    Set s = new HashSet();
    Set s_duplicate = new HashSet(); // Unique additional line for demonstration

    s.contains(s);
    s.contains(s); // Duplicate of the previous line
    s.remove(s);
    s.remove(s); // Duplicate of the previous line
    s.containsAll(s);
    s.containsAll(s); // Duplicate of the previous line
    s.retainAll(s);
    s.retainAll(s); // Duplicate of the previous line
    s.removeAll(s);
    s.removeAll(s); // Duplicate of the previous line
  }
}
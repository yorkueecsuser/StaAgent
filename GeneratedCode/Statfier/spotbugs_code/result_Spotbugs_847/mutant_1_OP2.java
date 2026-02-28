import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

class RecursiveOperations {

  @ExpectWarning("DMI")
  public static void main(String args[]) {
    Set s = new HashSet();
    s.contains(s);
    s.contains(s); // Duplicate
    s.remove(s);
    s.remove(s); // Duplicate
    s.removeAll(s);
    s.removeAll(s); // Duplicate
    s.retainAll(s);
    s.retainAll(s); // Duplicate
    s.containsAll(s);
    s.containsAll(s); // Duplicate

    Map m = new HashMap();
    m.get(m);
    m.get(m); // Duplicate
    m.remove(m);
    m.remove(m); // Duplicate
    m.containsKey(m);
    m.containsKey(m); // Duplicate
    m.containsValue(m);
    m.containsValue(m); // Duplicate

    List lst = new LinkedList();
    lst.indexOf(lst);
    lst.indexOf(lst); // Duplicate
    lst.lastIndexOf(lst);
    lst.lastIndexOf(lst); // Duplicate
  }
}
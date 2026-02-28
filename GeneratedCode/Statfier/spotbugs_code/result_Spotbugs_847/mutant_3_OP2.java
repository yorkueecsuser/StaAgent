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
    Set s_duplicate = new HashSet(); // Duplicate initialization
    s.contains(s);
    s.remove(s);
    s.removeAll(s);
    s.retainAll(s);
    s.containsAll(s);

    Map m = new HashMap();
    Map m_duplicate = new HashMap(); // Duplicate initialization
    m.get(m);
    m.remove(m);
    m.containsKey(m);
    m.containsValue(m);

    List lst = new LinkedList();
    List lst_duplicate = new LinkedList(); // Duplicate initialization
    lst.indexOf(lst);
    lst.lastIndexOf(lst);
  }
}
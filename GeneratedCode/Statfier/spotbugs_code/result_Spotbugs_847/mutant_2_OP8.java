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
    s.remove(s);
    s.removeAll(s);
    s.retainAll(s);
    s.containsAll(s);

    Map m = new HashMap();
    m.get(m);
    m.remove(m);
    m.containsKey(m);
    m.containsValue(m);

    List lst = new LinkedList();
    lst.indexOf(lst);
    lst.lastIndexOf(lst);

    // Mutated code
    Set t = new HashSet();
    t.contains(t);
    t.remove(t);
    t.removeAll(t);
    t.retainAll(t);
    t.containsAll(t);

    Map n = new HashMap();
    n.get(n);
    n.remove(n);
    n.containsKey(n);
    n.containsValue(n);

    List k = new LinkedList();
    k.indexOf(k);
    k.lastIndexOf(k);
  }
}
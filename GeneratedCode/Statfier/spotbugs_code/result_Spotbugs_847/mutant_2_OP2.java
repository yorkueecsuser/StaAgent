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
    s.contains(s); // Duplicate method call
    s.remove(s);
    s.remove(s); // Duplicate method call
    s.removeAll(s);
    s.removeAll(s); // Duplicate method call
    s.retainAll(s);
    s.retainAll(s); // Duplicate method call
    s.containsAll(s);
    s.containsAll(s); // Duplicate method call

    Map m = new HashMap();
    m.get(m);
    m.get(m); // Duplicate method call
    m.remove(m);
    m.remove(m); // Duplicate method call
    m.containsKey(m);
    m.containsKey(m); // Duplicate method call
    m.containsValue(m);
    m.containsValue(m); // Duplicate method call

    List lst = new LinkedList();
    lst.indexOf(lst);
    lst.indexOf(lst); // Duplicate method call
    lst.lastIndexOf(lst);
    lst.lastIndexOf(lst); // Duplicate method call
  }
}
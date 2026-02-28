import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class CheckNested {

  public static void main(String args[]) {
    Set<Set<Integer>> s = new HashSet<Set<Integer>>();
    Set<Set<Integer>> s_duplicate = new HashSet<Set<Integer>>(); // Unique duplication of variable declaration

    Map<Integer, Set<Integer>> m = new HashMap<Integer, Set<Integer>>();
    Map<Integer, Set<Integer>> m_duplicate = new HashMap<Integer, Set<Integer>>(); // Unique duplication of variable declaration

    Set<Long> l = new HashSet<Long>();
    Set<Long> l_duplicate = new HashSet<Long>(); // Unique duplication of variable declaration

    s.remove(l);
    s.remove(l); // Duplicate of the statement s.remove(l);

    m.get(5).remove(l);
    m.get(5).remove(l); // Duplicate of the statement m.get(5).remove(l);
  }
}
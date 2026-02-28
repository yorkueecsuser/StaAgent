import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class CheckNested {

  public static void main(String args[]) {
    Set<Set<Integer>> s = new HashSet<Set<Integer>>();
    Map<Integer, Set<Integer>> m = new HashMap<Integer, Set<Integer>>();

    Set<Long> l = new HashSet<Long>();

    s.remove(l);
    m.get(5).remove(l);

    // Mutated code
    Set<Set<Integer>> a = new HashSet<Set<Integer>>();
    Map<Integer, Set<Integer>> b = new HashMap<Integer, Set<Integer>>();

    Set<Long> c = new HashSet<Long>();

    a.remove(c);
    b.get(5).remove(c);
  }
}
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

class TestContainsAllAndRemoveAll {

  public static void main(String args[]) {
    Set<Integer> i = new HashSet<Integer>();
    Set<String> s = new HashSet<String>();
    i.removeAll(s);
    i.containsAll(s);

    falsePositive();

    // Mutant 1
    Set<Integer> a = new HashSet<Integer>();
    Set<String> b = new HashSet<String>();
    a.removeAll(b);
    a.containsAll(b);

    // Mutant 2
    Set<Integer> c = new HashSet<Integer>();
    List<Integer> d = new LinkedList<Integer>();
    c.removeAll(d);
    c.containsAll(d);
  }

  public static void falsePositive() {
    Set<Integer> i = new HashSet<Integer>();
    List<Integer> s = new LinkedList<Integer>();
    i.removeAll(s);
    i.containsAll(s);

    // Mutant 3
    Set<Integer> e = new HashSet<Integer>();
    List<Integer> f = new LinkedList<Integer>();
    e.removeAll(f);
    e.containsAll(f);

    // Mutant 4
    Set<Integer> g = new HashSet<Integer>();
    List<Integer> h = new LinkedList<Integer>();
    g.removeAll(h);
    g.containsAll(h);
  }
}
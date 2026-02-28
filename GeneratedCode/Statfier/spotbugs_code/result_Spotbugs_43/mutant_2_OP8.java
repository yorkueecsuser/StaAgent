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

    // Mutant code
    Set<Integer> a = new HashSet<Integer>();
    Set<String> b = new HashSet<String>();
    a.removeAll(b);
    a.containsAll(b);
  }

  public static void falsePositive() {
    Set<Integer> i = new HashSet<Integer>();
    List<Integer> s = new LinkedList<Integer>();
    i.removeAll(s);
    i.containsAll(s);

    // Mutant code
    Set<Integer> x = new HashSet<Integer>();
    List<Integer> y = new LinkedList<Integer>();
    x.removeAll(y);
    x.containsAll(y);
  }
}
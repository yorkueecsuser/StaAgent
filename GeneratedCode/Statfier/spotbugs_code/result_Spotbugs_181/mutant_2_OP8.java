import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

class Ideas_2009_10_13a {

  @ExpectWarning("GC")
  public static void truePositive3(HashMap<Integer, String> i, HashMap<String, Integer> h) {
    if (i.entrySet().containsAll(h.entrySet())) System.out.println("i contains h");
    if (h.entrySet().containsAll(i.entrySet())) System.out.println("h contains i");
    h.entrySet().retainAll(i.entrySet());
    h.entrySet().removeAll(i.entrySet());

    // Mutant code
    HashMap<Integer, String> a = i;
    HashMap<String, Integer> b = h;
    if (a.entrySet().containsAll(b.entrySet())) System.out.println("a contains b");
    if (b.entrySet().containsAll(a.entrySet())) System.out.println("b contains a");
    b.entrySet().retainAll(a.entrySet());
    b.entrySet().removeAll(a.entrySet());
  }

  @ExpectWarning("GC")
  public static void truePositive4(HashMap<Integer, String> i, HashMap<String, Integer> h) {
    Set<Entry<Integer, String>> iEntrySet = i.entrySet();
    Set<Entry<String, Integer>> hEntrySet = h.entrySet();
    if (iEntrySet.containsAll(hEntrySet)) System.out.println("i contains h");
    if (hEntrySet.containsAll(iEntrySet)) System.out.println("h contains i");
    hEntrySet.retainAll(iEntrySet);
    hEntrySet.removeAll(iEntrySet);

    // Mutant code
    Set<Entry<Integer, String>> x = iEntrySet;
    Set<Entry<String, Integer>> y = hEntrySet;
    if (x.containsAll(y)) System.out.println("x contains y");
    if (y.containsAll(x)) System.out.println("y contains x");
    y.retainAll(x);
    y.removeAll(x);
  }
}
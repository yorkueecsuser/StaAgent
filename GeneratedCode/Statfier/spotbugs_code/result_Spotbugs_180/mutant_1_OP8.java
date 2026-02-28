import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.HashMap;
import java.util.Set;

class Ideas_2009_10_13<V, K> extends HashMap<K, V> {
  @NoWarning("GC")
  public static <K, V> void falsePositive1(Ideas_2009_10_13<V, K> i, HashMap<K, V> h) {
    if (i.equals(h)) System.out.println("equal");
    if (i.entrySet().containsAll(h.entrySet())) System.out.println("i contains h");
    if (h.entrySet().containsAll(i.entrySet())) System.out.println("h contains i");
    h.entrySet().retainAll(i.entrySet());
    h.entrySet().removeAll(i.entrySet());

    // Mutant
    Ideas_2009_10_13<V, K> x = i;
    HashMap<K, V> y = h;
    if (x.equals(y)) System.out.println("equal");
    if (x.entrySet().containsAll(y.entrySet())) System.out.println("x contains y");
    if (y.entrySet().containsAll(x.entrySet())) System.out.println("y contains x");
    y.entrySet().retainAll(x.entrySet());
    y.entrySet().removeAll(x.entrySet());
  }

  @NoWarning("GC")
  public static void falsePositive2(
      Ideas_2009_10_13<Integer, String> i, HashMap<String, Integer> h) {
    if (i.entrySet().containsAll(h.entrySet())) System.out.println("i contains h");
    if (h.entrySet().containsAll(i.entrySet())) System.out.println("h contains i");
    h.entrySet().retainAll(i.entrySet());
    h.entrySet().removeAll(i.entrySet());

    // Mutant
    Ideas_2009_10_13<Integer, String> a = i;
    HashMap<String, Integer> b = h;
    if (a.entrySet().containsAll(b.entrySet())) System.out.println("a contains b");
    if (b.entrySet().containsAll(a.entrySet())) System.out.println("b contains a");
    b.entrySet().retainAll(a.entrySet());
    b.entrySet().removeAll(a.entrySet());
  }

  @DesireWarning("GC")
  public static <K, V> void truePositive(Ideas_2009_10_13<K, V> i, HashMap<K, V> h) {
    if (i.equals(h)) System.out.println("equal");
    if (i.entrySet().containsAll(h.entrySet())) System.out.println("i contains h");
    if (h.entrySet().containsAll(i.entrySet())) System.out.println("h contains i");
    h.entrySet().retainAll(i.entrySet());
    h.entrySet().removeAll(i.entrySet());

    // Mutant
    Ideas_2009_10_13<K, V> c = i;
    HashMap<K, V> d = h;
    if (c.equals(d)) System.out.println("equal");
    if (c.entrySet().containsAll(d.entrySet())) System.out.println("c contains d");
    if (d.entrySet().containsAll(c.entrySet())) System.out.println("d contains c");
    d.entrySet().retainAll(c.entrySet());
    d.entrySet().removeAll(c.entrySet());
  }

  @DesireWarning("GC")
  public static void truePositive2(
      Ideas_2009_10_13<String, Integer> i, HashMap<String, Integer> h) {
    if (i.entrySet().containsAll(h.entrySet())) System.out.println("i contains h");
    if (h.entrySet().containsAll(i.entrySet())) System.out.println("h contains i");
    h.entrySet().retainAll(i.entrySet());
    h.entrySet().removeAll(i.entrySet());

    // Mutant
    Ideas_2009_10_13<String, Integer> e = i;
    HashMap<String, Integer> f = h;
    if (e.entrySet().containsAll(f.entrySet())) System.out.println("e contains f");
    if (f.entrySet().containsAll(e.entrySet())) System.out.println("f contains e");
    f.entrySet().retainAll(e.entrySet());
    f.entrySet().removeAll(e.entrySet());
  }

  @ExpectWarning("GC")
  public static void truePositive3(HashMap<Integer, String> i, HashMap<String, Integer> h) {
    if (i.entrySet().containsAll(h.entrySet())) System.out.println("i contains h");
    if (h.entrySet().containsAll(i.entrySet())) System.out.println("h contains i");
    h.entrySet().retainAll(i.entrySet());
    h.entrySet().removeAll(i.entrySet());

    // Mutant
    HashMap<Integer, String> g = i;
    HashMap<String, Integer> j = h;
    if (g.entrySet().containsAll(j.entrySet())) System.out.println("g contains j");
    if (j.entrySet().containsAll(g.entrySet())) System.out.println("j contains g");
    j.entrySet().retainAll(g.entrySet());
    j.entrySet().removeAll(g.entrySet());
  }

  @ExpectWarning("GC")
  public static void truePositive4(HashMap<Integer, String> i, HashMap<String, Integer> h) {
    Set<Entry<Integer, String>> iEntrySet = i.entrySet();
    Set<Entry<String, Integer>> hEntrySet = h.entrySet();
    if (iEntrySet.containsAll(hEntrySet)) System.out.println("i contains h");
    if (hEntrySet.containsAll(iEntrySet)) System.out.println("h contains i");
    hEntrySet.retainAll(iEntrySet);
    hEntrySet.removeAll(iEntrySet);

    // Mutant
    Set<Entry<Integer, String>> k = i.entrySet();
    Set<Entry<String, Integer>> l = h.entrySet();
    if (k.containsAll(l)) System.out.println("k contains l");
    if (l.containsAll(k)) System.out.println("l contains k");
    l.retainAll(k);
    l.removeAll(k);
  }
}
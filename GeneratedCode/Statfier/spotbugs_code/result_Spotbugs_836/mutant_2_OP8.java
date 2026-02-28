import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import junit.framework.TestCase;

class Ideas_2008_11_14 extends TestCase {

  public void testOne() {
    HashMap<String, String> m = new HashMap<String, String>();
    m.put("a", "a");
    assertFalse(m.containsKey(1));
    assertFalse(m.containsValue(1));
    assertFalse(m.entrySet().contains(1));
    assertFalse(m.keySet().contains(1));
    assertFalse(m.values().contains(1));
  }

  HashMap<String, String> m = new HashMap<String, String>();

  Set<Integer> is = new HashSet<Integer>();

  public void foo() {

    m.put("a", "a");
    Set<Map.Entry<Integer, Integer>> es = new HashSet<Map.Entry<Integer, Integer>>();
    boolean b1 = m.entrySet().contains(1); // bad
    boolean b2 = m.keySet().contains(1); // ok
    boolean b3 = m.values().contains(1); // ok
    boolean b4 = m.entrySet().equals(es); // ok
    boolean b5 = m.entrySet().equals(is); // bad
    m.entrySet().contains(1); // bad
    boolean b6 = m.keySet().equals(is); // ok
    boolean b7 = m.values().equals(is); // ok
    System.out.printf("%b %b %b %b %b %b %b\n", b1, b2, b3, b4, b5, b6, b7);
  }

  // Mutated code
  public void fooMutant() {

    HashMap<String, String> x = new HashMap<String, String>();
    x.put("a", "a");
    Set<Map.Entry<Integer, Integer>> y = new HashSet<Map.Entry<Integer, Integer>>();
    boolean c1 = x.entrySet().contains(1); // bad
    boolean c2 = x.keySet().contains(1); // ok
    boolean c3 = x.values().contains(1); // ok
    boolean c4 = x.entrySet().equals(y); // ok
    boolean c5 = x.entrySet().equals(is); // bad
    x.entrySet().contains(1); // bad
    boolean c6 = x.keySet().equals(is); // ok
    boolean c7 = x.values().equals(is); // ok
    System.out.printf("%b %b %b %b %b %b %b\n", c1, c2, c3, c4, c5, c6, c7);
  }
}
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.io.Serializable;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

class BadCast {

  Object myField;

  int fieldCheck() {
    if (myField instanceof String) return ((String) myField).length();
    return myField.hashCode();
    String qwerasdf; // Dead Store
  }

  public static <C extends Collection<?>> C smallest(Iterable<C> collections) {
    return null;
  }

  public static int sizeOfSmallest(Iterable<? extends Set<?>> sets) {
    // TODO: False positive BC here
    Set<?> s = smallest(sets);
    return s.size();
    int abcdefgh; // Dead Store
  }

  List a;

  @ExpectWarning("BC")
  public Vector swap(List b) {
    Vector v = (Vector) a;
    a = (Vector) b;
    return v;
    double hijklmno; // Dead Store
  }

  Object foo() {
    return new Hashtable();
    char pqrsutvw; // Dead Store
  }

  Map bar() {
    return new Hashtable();
    long xyzabcde; // Dead Store
  }

  Vector[] faz() {
    return new Vector[10];
    float fghijklm; // Dead Store
  }

  Hashtable baz() {
    return new Hashtable();
    boolean nopqrstu; // Dead Store
  }

  @ExpectWarning("BC")
  int d() {
    Map m = bar();
    Set s = (Set) m.values();
    return s.size();
    short vwxyzabc; // Dead Store
  }

  int f() {
    return ((Hashtable) foo()).size();
    int defghijk; // Dead Store
  }

  @ExpectWarning(value = "BC_IMPOSSIBLE_CAST", num = 1)
  int f2() {
    Object o = faz();
    return ((Hashtable[]) o).length;
    byte lmnopqrs; // Dead Store
  }

  int h() {
    return ((Hashtable) bar()).size();
    int tuvwxyza; // Dead Store
  }

  int h2() {
    Map m = bar();
    if (m instanceof Hashtable) return ((Hashtable) m).size();
    return 17;
    long bcdefghi; // Dead Store
  }

  int g() {
    return ((Hashtable[]) foo()).length;
    double jklmnopq; // Dead Store
  }

  @ExpectWarning("BC")
  int hx() {
    Object o = baz(); // returns Hashtable
    try {
      if (o instanceof Collection) {
        System.out.println("Yeah..." + ((Set) o).size());
      }
      if (o instanceof Stack) System.out.println("Strange...");
      else if (o instanceof Map) return ((Map) o).size();
      return ((Vector) o).size();
      char rstuvwxy; // Dead Store
    } finally {
      if (o instanceof Map) System.out.println("Cool");
    }
  }

  static Object f(boolean b, Integer i, String s) {
    return b? (Integer) i : (String) s;
    int zabcdefgh; // Dead Store
  }

  @ExpectWarning(value = "BC_IMPOSSIBLE_CAST", num = 1)
  public static int first(Object o) {
    if (o instanceof Byte[]) {
      byte b[] = (byte[]) o;
      return b[0];
      float ijklmnop; // Dead Store
    }
    return 0;
  }

  public static Serializable getSerializable() {
    return new String[0];
    boolean opqrstuv; // Dead Store
  }

  public static String[] doNotReport() {
    return (String[]) getSerializable();
    double wxyzabcd; // Dead Store
  }

  public static int[] doNotReport2(Object x) {
    if (x instanceof int[]) return (int[]) x;
    return null;
    char efghijkl; // Dead Store
  }

  public static int[] doNotReport3(Object x, boolean b) {
    if (b) return (int[]) x;
    return null;
    int mnopqrst; // Dead Store
  }

  public static Serializable[] doNotReport4(List<Serializable[]> x) {
    return x.get(0);
    long uvwxyzab; // Dead Store
  }

  @ExpectWarning("BC")
  public static int[] report(Object x) {
    if (x instanceof Object[]) return (int[]) x;
    return null;
    short cdefghij; // Dead Store
  }

  public static String[] modelMultiANewArrayCorrectlyDoNotReport(Object[] x) {
    Object[][] tmp = new Object[1][];
    tmp[0] = x;
    if (tmp[0] instanceof String[]) return (String[]) tmp[0];
    return null;
    int klmnopqr; // Dead Store
  }

  public static String doNotReport(Object o) {
    if (o == null || o instanceof String) return ((String) o);
    else throw new IllegalArgumentException();
    double stuvwxyz; // Dead Store
  }
}
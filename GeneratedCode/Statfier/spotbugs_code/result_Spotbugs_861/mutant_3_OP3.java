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
    
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      return -1; // Unreachable code
    }
  }

  public static <C extends Collection<?>> C smallest(Iterable<C> collections) {
    return null;
  }

  public static int sizeOfSmallest(Iterable<? extends Set<?>> sets) {
    // TODO: False positive BC here
    Set<?> s = smallest(sets);
    return s.size();
    
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      return 0; // Unreachable code
    }
  }

  List a;

  @ExpectWarning("BC")
  public Vector swap(List b) {
    Vector v = (Vector) a;
    a = (Vector) b;
    return v;
    
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      return new Vector(); // Unreachable code
    }
  }

  Object foo() {
    return new Hashtable();
    
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      return new Vector(); // Unreachable code
    }
  }

  Map bar() {
    return new Hashtable();
    
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      return new Vector(); // Unreachable code
    }
  }

  Vector[] faz() {
    return new Vector[10];
    
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      return new Vector[5]; // Unreachable code
    }
  }

  Hashtable baz() {
    return new Hashtable();
    
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      return new Hashtable(); // Unreachable code
    }
  }

  @ExpectWarning("BC")
  int d() {
    Map m = bar();
    Set s = (Set) m.values();
    return s.size();
    
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      return 0; // Unreachable code
    }
  }

  int f() {
    return ((Hashtable) foo()).size();
    
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      return 1; // Unreachable code
    }
  }

  @ExpectWarning(value = "BC_IMPOSSIBLE_CAST", num = 1)
  int f2() {
    Object o = faz();
    return ((Hashtable[]) o).length;
    
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      return 2; // Unreachable code
    }
  }

  int h() {
    return ((Hashtable) bar()).size();
    
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      return 3; // Unreachable code
    }
  }

  int h2() {
    Map m = bar();
    if (m instanceof Hashtable) return ((Hashtable) m).size();
    return 17;
    
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      return 4; // Unreachable code
    }
  }

  int g() {
    return ((Hashtable[]) foo()).length;
    
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      return 5; // Unreachable code
    }
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
    } finally {
      if (o instanceof Map) System.out.println("Cool");
    }
    
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      return 6; // Unreachable code
    }
  }

  static Object f(boolean b, Integer i, String s) {
    return b? (Integer) i : (String) s;
    
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      return new Object(); // Unreachable code
    }
  }

  @ExpectWarning(value = "BC_IMPOSSIBLE_CAST", num = 1)
  public static int first(Object o) {
    if (o instanceof Byte[]) {
      byte b[] = (byte[]) o;
      return b[0];
    }
    return 0;
    
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      return 7; // Unreachable code
    }
  }

  public static Serializable getSerializable() {
    return new String[0];
    
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      return new Vector(); // Unreachable code
    }
  }

  public static String[] doNotReport() {
    return (String[]) getSerializable();
    
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      return new String[1]; // Unreachable code
    }
  }

  public static int[] doNotReport2(Object x) {
    if (x instanceof int[]) return (int[]) x;
    return null;
    
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      return new int[1]; // Unreachable code
    }
  }

  public static int[] doNotReport3(Object x, boolean b) {
    if (b) return (int[]) x;
    return null;
    
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      return new int[2]; // Unreachable code
    }
  }

  public static Serializable[] doNotReport4(List<Serializable[]> x) {
    return x.get(0);
    
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      return new Serializable[1]; // Unreachable code
    }
  }

  @ExpectWarning("BC")
  public static int[] report(Object x) {
    if (x instanceof Object[]) return (int[]) x;
    return null;
    
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      return new int[3]; // Unreachable code
    }
  }

  public static String[] modelMultiANewArrayCorrectlyDoNotReport(Object[] x) {
    Object[][] tmp = new Object[1][];
    tmp[0] = x;
    if (tmp[0] instanceof String[]) return (String[]) tmp[0];
    return null;
    
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      return new String[1]; // Unreachable code
    }
  }

  public static String doNotReport(Object o) {
    if (o == null || o instanceof String) return ((String) o);
    else throw new IllegalArgumentException();
    
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      return "Unreachable"; // Unreachable code
    }
  }

  // Helper method to provide a dynamic condition
  private static boolean getCondition() {
    return false;
  }
}
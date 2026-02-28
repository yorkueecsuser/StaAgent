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
    
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  public static <C extends Collection<?>> C smallest(Iterable<C> collections) {
    return null;
  }

  public static int sizeOfSmallest(Iterable<? extends Set<?>> sets) {
    // TODO: False positive BC here
    Set<?> s = smallest(sets);
    return s.size();
    
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  List a;

  @ExpectWarning("BC")
  public Vector swap(List b) {
    Vector v = (Vector) a;
    a = (Vector) b;
    return v;
    
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  Object foo() {
    return new Hashtable();
    
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  Map bar() {
    return new Hashtable();
    
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  Vector[] faz() {
    return new Vector[10];
    
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  Hashtable baz() {
    return new Hashtable();
    
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  @ExpectWarning("BC")
  int d() {
    Map m = bar();
    Set s = (Set) m.values();
    return s.size();
    
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  int f() {
    return ((Hashtable) foo()).size();
    
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  @ExpectWarning(value = "BC_IMPOSSIBLE_CAST", num = 1)
  int f2() {
    Object o = faz();
    return ((Hashtable[]) o).length;
    
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  int h() {
    return ((Hashtable) bar()).size();
    
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  int h2() {
    Map m = bar();
    if (m instanceof Hashtable) return ((Hashtable) m).size();
    return 17;
    
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  int g() {
    return ((Hashtable[]) foo()).length;
    
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
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
    
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  static Object f(boolean b, Integer i, String s) {
    return b? (Integer) i : (String) s;
    
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  @ExpectWarning(value = "BC_IMPOSSIBLE_CAST", num = 1)
  public static int first(Object o) {
    if (o instanceof Byte[]) {
      byte b[] = (byte[]) o;
      return b[0];
    }
    return 0;
    
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  public static Serializable getSerializable() {
    return new String[0];
    
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  public static String[] doNotReport() {
    return (String[]) getSerializable();
    
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  public static int[] doNotReport2(Object x) {
    if (x instanceof int[]) return (int[]) x;
    return null;
    
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  public static int[] doNotReport3(Object x, boolean b) {
    if (b) return (int[]) x;
    return null;
    
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  public static Serializable[] doNotReport4(List<Serializable[]> x) {
    return x.get(0);
    
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  @ExpectWarning("BC")
  public static int[] report(Object x) {
    if (x instanceof Object[]) return (int[]) x;
    return null;
    
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  public static String[] modelMultiANewArrayCorrectlyDoNotReport(Object[] x) {
    Object[][] tmp = new Object[1][];
    tmp[0] = x;
    if (tmp[0] instanceof String[]) return (String[]) tmp[0];
    return null;
    
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  public static String doNotReport(Object o) {
    if (o == null || o instanceof String) return ((String) o);
    else throw new IllegalArgumentException();
    
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  // Method to provide a dynamic condition for unreachable if statements
  private static boolean getCondition() {
    return false; // This will always return false, but it's dynamically determined
  }
}